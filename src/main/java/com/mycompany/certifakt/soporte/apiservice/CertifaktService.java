/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.apiservice;

import com.google.gson.Gson;
import com.mycompany.certifakt.soporte.config.ConfigFile;
import com.mycompany.certifakt.soporte.httpmethods.MethodHttp;
import com.mycompany.certifakt.soporte.payload.LoginRequest;
import com.mycompany.certifakt.soporte.payload.dto.PaymentVoucherDto;
import com.mycompany.certifakt.soporte.payload.dto.CompanyDto;
import com.mycompany.certifakt.soporte.payload.dto.GuiaDto;
import com.mycompany.certifakt.soporte.payload.dto.UserDto;
import com.mycompany.certifakt.soporte.payload.dto.UserDto2;
import com.mycompany.certifakt.soporte.payload.request.CompanyRequest;
import com.mycompany.certifakt.soporte.payload.request.CreateCompanyRequest;
import com.mycompany.certifakt.soporte.payload.request.GuiaRequest;
import com.mycompany.certifakt.soporte.payload.request.PaymentVoucherRequest;
import com.mycompany.certifakt.soporte.payload.request.SupportConsultRequest;
import com.mycompany.certifakt.soporte.payload.request.UserRequest;
import com.mycompany.certifakt.soporte.payload.response.SupportResponse;
import com.mycompany.certifakt.soporte.payload.response.UserLoginResponse;
import com.mycompany.certifakt.soporte.payload.response.UserTokenResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;

public class CertifaktService {
        
    private static final String LOGIN_ENDPOINT = "api/auth/login";
    private static final String VALIDATE_ENDPOINT = "api/auth/me";
    
    private static final String VOUCHER_ENDPOINT = "api/support/payment-voucher";
    private static final String COMPANY_ENDPOINT = "api/support/company";
    private static final String TOKEN_ENDPOINT = "api/usuarios/generar-token-api";
    private static final String GUIA_ENDPOINT = "api/support/guia";
    private static final String CREAR_COMPANY_ENDPOINT = "api/auth/register";
    private static final String USER_ENDPOINT = "api/support/user";
    
    private static final Gson gson = new Gson();
    private static final OkHttpClient client = new OkHttpClient(); 
    
    public static Boolean login(String username, String password) {
        String API_URL = ConfigFile.obtenerUrl();
        LoginRequest loginRequest = new LoginRequest(username, password);
        
        UserLoginResponse userLoginResponse = MethodHttp.post(API_URL+LOGIN_ENDPOINT, null, loginRequest, UserLoginResponse.class);
        
        if (userLoginResponse != null && userLoginResponse.getAccessToken() != null) {
            System.out.println("Token obtenido: " + userLoginResponse.getAccessToken());
            ConfigFile.guardarToken(userLoginResponse.getAccessToken());
            return true;
        } else {    
            System.out.println("Error en autenticación.");
            return false;
        }
    }
    
    public static UserDto validateSession() {
        String token = ConfigFile.obtenerToken();
        if(token == null || token.isEmpty()) {
            return null;
        } 
        Map<String, String> params = new HashMap<>();
        String API_URL = ConfigFile.obtenerUrl();
        UserLoginResponse userLoginResponse = null;
        try {
            userLoginResponse = MethodHttp.get(API_URL+VALIDATE_ENDPOINT, params, token, UserLoginResponse.class);
            System.out.println("Usuario logueado: " + userLoginResponse.getFullName());
            return new UserDto();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static CompanyDto getCompany(String ruc) throws IOException {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        Map<String, String> params = new HashMap<>();
        params.put("ruc", ruc);
        SupportResponse supportResponse = null;
        try {
            supportResponse = MethodHttp.get(API_URL+COMPANY_ENDPOINT, params, token, SupportResponse.class);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
            //System.out.println("ERROR: "+e.getMessage());
            //e.printStackTrace();
        }
        if(supportResponse == null) {
            return null;
        }
        CompanyDto companyDto = (CompanyDto) supportResponse.getData().getCompanyDto();
        return companyDto;
    }
    
    public static Boolean updateCompany(CompanyRequest companyRequest) {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        SupportResponse supportResponse = null;
        try {
            supportResponse = MethodHttp.put(API_URL+COMPANY_ENDPOINT, token, companyRequest, SupportResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(supportResponse == null) {
            return null;
        }
        return supportResponse.getIsSuccess();
    }
    
    public static Boolean createCompany(CreateCompanyRequest createCompanyRequest) {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        
        Object supportResponse = null;
        try {
            supportResponse = MethodHttp.post(API_URL+CREAR_COMPANY_ENDPOINT, token, createCompanyRequest, Object.class);
        } catch (Exception e) {
            System.err.println("Error en la solicitud POST: " + e.getMessage());
            e.printStackTrace();
        }
        if(supportResponse == null) {
            return null;
        } else {
            return true;
        }   
    }
    
    public static PaymentVoucherDto getPaymentVoucher(SupportConsultRequest supportConsultRequest) {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        
        Map<String, String> params = new HashMap<>();
        params.put("rucEmisor", supportConsultRequest.getRucEmisor());
        params.put("tipoComprobante", supportConsultRequest.getTipoComprobante());
        params.put("serie", supportConsultRequest.getSerie());
        params.put("numero", supportConsultRequest.getNumero().toString());
        SupportResponse supportResponse = null;
        try {
            supportResponse = MethodHttp.get(API_URL+VOUCHER_ENDPOINT, params, token, SupportResponse.class);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
            //e.printStackTrace();
        }
        if(supportResponse == null) {
            return null;
        }
        System.out.println("DATA: "+supportResponse.getData().getPaymentVoucherDto().getDenominacionReceptor());
        PaymentVoucherDto paymentVoucherDto = (PaymentVoucherDto) supportResponse.getData().getPaymentVoucherDto();
        return paymentVoucherDto;
    }
    
    public static Boolean updatePaymentVoucher(PaymentVoucherRequest paymentVoucherRequest) {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        SupportResponse supportResponse = null;
        try {
           supportResponse = MethodHttp.put(API_URL+VOUCHER_ENDPOINT, token, paymentVoucherRequest, SupportResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        if(supportResponse == null) {
            return null;
        }
        return supportResponse.getIsSuccess();
    }
    
    public static GuiaDto getGuia(SupportConsultRequest supportConsultRequest) {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        Map<String, String> params = new HashMap<>();
        params.put("ruc", supportConsultRequest.getRucEmisor());
        params.put("tipoComprobante", supportConsultRequest.getTipoComprobante());
        params.put("serie", supportConsultRequest.getSerie());
        params.put("numero", supportConsultRequest.getNumero().toString());
        SupportResponse supportResponse = null;
        try {
            supportResponse = MethodHttp.get(API_URL+GUIA_ENDPOINT, params, token, SupportResponse.class);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
            //e.printStackTrace();
        }
        if(supportResponse == null) {
            return null;
        }
        GuiaDto guiaDto = (GuiaDto) supportResponse.getData().getGuiaDto();
        return guiaDto;
    }
    
    public static Boolean updateGuia(GuiaRequest guiaRequest) {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        SupportResponse supportResponse = null;
        try {
            supportResponse = MethodHttp.put(API_URL+GUIA_ENDPOINT, token, guiaRequest, SupportResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(supportResponse == null) {
            return null;
        }
        return supportResponse.getIsSuccess();
    }
    
    public static String getUserToken(Long userId) {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        Map<String, String> params = new HashMap<>();
        UserTokenResponse userTokenResponse = null;
        try {
            userTokenResponse = MethodHttp.get(API_URL+TOKEN_ENDPOINT+"/"+userId, params, token, UserTokenResponse.class);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
            //e.printStackTrace();
        }
        if(userTokenResponse == null) {
            return null;
        }
        String userToken = userTokenResponse.getToken();
        return userToken;
    }
    
    public static List<UserDto2> getUserList(String ruc) {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        Map<String, String> params = new HashMap<>();
        params.put("ruc", ruc);
        SupportResponse supportResponse = null;
        try {
            supportResponse = MethodHttp.get(API_URL+USER_ENDPOINT, params, token, SupportResponse.class);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
            //e.printStackTrace();
        }
        if(supportResponse == null) {
            return null;
        }
        List<UserDto2> userList = (List<UserDto2>) supportResponse.getData().getUserDtoList();
        return userList;
    }
    
    public static Boolean UpdateUser(UserRequest userRequest) {
        return true;
    }
}