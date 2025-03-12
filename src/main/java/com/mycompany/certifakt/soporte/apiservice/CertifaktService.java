/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.apiservice;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mycompany.certifakt.soporte.config.ConfigFile;
import com.mycompany.certifakt.soporte.httpmethods.MethodHttp;
import com.mycompany.certifakt.soporte.payload.LoginRequest;
import com.mycompany.certifakt.soporte.payload.dto.PaymentVoucherDto;
import com.mycompany.certifakt.soporte.payload.dto.CompanyDto;
import com.mycompany.certifakt.soporte.payload.dto.UserDto;
import com.mycompany.certifakt.soporte.payload.request.CompanyRequest;
import com.mycompany.certifakt.soporte.payload.response.CompanyResponse;
import com.mycompany.certifakt.soporte.payload.request.SupportConsultRequest;
import com.mycompany.certifakt.soporte.payload.response.SupportResponse;
import com.mycompany.certifakt.soporte.payload.response.UserLoginResponse;
import com.mycompany.certifakt.soporte.payload.response.UserTokenResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class CertifaktService {
        
    private static final String LOGIN_ENDPOINT = "api/auth/login";
    private static final String VALIDATE_ENDPOINT = "api/auth/me";
    
    private static final String VOUCHER_ENDPOINT = "api/support/payment-voucher";
    private static final String COMPANY_ENDPOINT = "api/support/company";
    private static final String TOKEN_ENDPOINT = "api/usuarios/generar-token-api";
    
    private static final Gson gson = new Gson();
    private static final OkHttpClient client = new OkHttpClient(); 
    
    public static Boolean login(String username, String password) {
        String API_URL = ConfigFile.obtenerUrl();
        LoginRequest loginRequest = new LoginRequest(username, password);
        
        UserLoginResponse userLoginResponse = MethodHttp.post(API_URL+LOGIN_ENDPOINT, loginRequest, UserLoginResponse.class);
        
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
        try {
            UserLoginResponse userLoginResponse = MethodHttp.get(API_URL+VALIDATE_ENDPOINT, params, token, UserLoginResponse.class);
            System.out.println("Usuario logueado: " + userLoginResponse.getFullName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new UserDto();
    }
    
    public static CompanyDto getCompany(String ruc) {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        Map<String, String> params = new HashMap<>();
        params.put("ruc", ruc);
        SupportResponse supportResponse = null;
        try {
            supportResponse = MethodHttp.get(API_URL+COMPANY_ENDPOINT, params, token, SupportResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
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
            e.printStackTrace();
        }
        if(supportResponse == null) {
            return null;
        }
        System.out.println("DATA: "+supportResponse.getData().getPaymentVoucherDto().getDenominacionReceptor());
        PaymentVoucherDto paymentVoucherDto = (PaymentVoucherDto) supportResponse.getData().getPaymentVoucherDto();
        return paymentVoucherDto;
    }
    
    public static String getUserToken(Long userId) {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        Map<String, String> params = new HashMap<>();
        UserTokenResponse userTokenResponse = null;
        try {
            userTokenResponse = MethodHttp.get(API_URL+TOKEN_ENDPOINT+"/"+userId, params, token, UserTokenResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(userTokenResponse == null) {
            return null;
        }
        String userToken = userTokenResponse.getToken();
        return userToken;
    }
    
    
}