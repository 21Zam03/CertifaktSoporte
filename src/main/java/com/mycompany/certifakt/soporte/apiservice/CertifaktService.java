/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.apiservice;

import com.mycompany.certifakt.soporte.config.ConfigFile;
import com.mycompany.certifakt.soporte.exception.CustomHttpException;
import com.mycompany.certifakt.soporte.httpmethods.MethodHttp;
import com.mycompany.certifakt.soporte.payload.LoginRequest;
import com.mycompany.certifakt.soporte.payload.dto.PaymentVoucherDto;
import com.mycompany.certifakt.soporte.payload.dto.CompanyDto;
import com.mycompany.certifakt.soporte.payload.dto.GuiaDto;
import com.mycompany.certifakt.soporte.payload.dto.InfoDownloadDto;
import com.mycompany.certifakt.soporte.payload.dto.UserDto;
import com.mycompany.certifakt.soporte.payload.dto.UserDto2;
import com.mycompany.certifakt.soporte.payload.request.ChangePasswordRequest;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CertifaktService {
        
    private static final String LOGIN_ENDPOINT = "api/auth/login";
    private static final String VALIDATE_ENDPOINT = "api/auth/me";
    
    private static final String VOUCHER_ENDPOINT = "api/support/payment-voucher";
    private static final String COMPANY_ENDPOINT = "api/support/company";
    private static final String TOKEN_ENDPOINT = "api/usuarios/generar-token-api";
    private static final String GUIA_ENDPOINT = "api/support/guia";
    private static final String CREAR_COMPANY_ENDPOINT = "api/auth/register";
    private static final String USER_ENDPOINT = "api/support/user";
    private static final String CHANGE_PASSWORD_ENDPOINT = "/changePassword";
    private static final String CONSULT_DOWNLOAD_ENDPOINT = "/consultar-descarga-pdf";
    
    public static Boolean login(String username, String password) {
        String API_URL = ConfigFile.obtenerUrl();
        LoginRequest loginRequest = new LoginRequest(username, password);
        
        try {
            UserLoginResponse userLoginResponse = MethodHttp.post(API_URL+LOGIN_ENDPOINT, null, loginRequest, UserLoginResponse.class);
        
            if (userLoginResponse != null && userLoginResponse.getAccessToken() != null) {               
                ConfigFile.guardarToken(userLoginResponse.getAccessToken());
                return true;
            } 
            return false;
        } catch (CustomHttpException e) {
            return false;
        }
    }
    
    public static UserDto validateSession() throws IOException {
        String token = ConfigFile.obtenerToken();
        if(token == null || token.isEmpty()) {
            return null;
        } 
        Map<String, String> params = new HashMap<>();
        String API_URL = ConfigFile.obtenerUrl();
        try {
            UserLoginResponse userLoginResponse = MethodHttp.get(API_URL+VALIDATE_ENDPOINT, params, token, UserLoginResponse.class);
            System.out.println("Usuario logueado: " + userLoginResponse.getFullName());
            return new UserDto();
        } catch (CustomHttpException e) {
            System.err.println("Error HTTP: " + e.getMessage());
            return null;
        } 
    }
    
    public static Optional<CompanyDto> getCompany(String ruc) throws IOException {
        if(ruc == null || ruc.isEmpty()) {
            throw new IllegalArgumentException("El ruc no puede ser nulo o vacio");
        }
        
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        
        Map<String, String> params = new HashMap<>();
        params.put("ruc", ruc);
        
        try {
            SupportResponse supportResponse = MethodHttp.get(API_URL + COMPANY_ENDPOINT, params, token, SupportResponse.class);

            if (supportResponse == null || supportResponse.getData() == null || supportResponse.getData().getCompanyDto() == null) {
                return Optional.empty();
            }

            return Optional.of(supportResponse.getData().getCompanyDto());

        } catch (CustomHttpException e) {
            System.err.println("Error HTTP: " + e.getMessage());
            return Optional.empty();
        } catch (IllegalArgumentException e) {
            System.err.println("Error en los parámetros: " + e.getMessage());
            throw e;
        } catch (IOException e) {
            System.err.println("Error inesperado de conexión: " + e.getMessage());
            throw e; 
        }
    }
    
    public static Optional<SupportResponse> updateCompany(CompanyRequest companyRequest) throws IOException {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        try {
            SupportResponse supportResponse = MethodHttp.put(API_URL+COMPANY_ENDPOINT, token, companyRequest, SupportResponse.class);
            if(supportResponse == null || supportResponse.getMessage() == null || supportResponse.getIsSuccess() == null) {
                return Optional.empty();
            }
            return Optional.of(supportResponse);
        } catch (CustomHttpException e) {
            System.err.println("Error HTTP: " + e.getMessage());
            return Optional.empty();
        } catch (IllegalArgumentException e) {
            System.err.println("Error en los parámetros: " + e.getMessage());
            throw e;
        } catch (IOException e) {
            System.err.println("Error inesperado de conexión: " + e.getMessage());
            throw e; 
        }
    }
    
    public static Optional<Object> createCompany(CreateCompanyRequest createCompanyRequest) throws IOException {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        
        try {
            Object userObject = MethodHttp.post(API_URL+CREAR_COMPANY_ENDPOINT, token, createCompanyRequest, Object.class);
            if(userObject == null) {
                return Optional.empty();
            } 
            return Optional.of(userObject);
        } catch (CustomHttpException e) {
            System.err.println("Error HTTP: " + e.getMessage());
            return Optional.empty();
        } catch (IllegalArgumentException e) {
            System.err.println("Error en los parámetros: " + e.getMessage());
            throw e;
        } catch (Exception e) {
            System.err.println("Error inesperado de conexión: " + e.getMessage());
            throw e; 
        }  
    }
    
    public static Optional<PaymentVoucherDto> getPaymentVoucher(SupportConsultRequest supportConsultRequest) throws IOException {
        //Validation.validarSolicitud(supportConsultRequest);
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        
        Map<String, String> params = new HashMap<>();
        params.put("rucEmisor", supportConsultRequest.getRucEmisor());
        params.put("tipoComprobante", supportConsultRequest.getTipoComprobante());
        params.put("serie", supportConsultRequest.getSerie());
        params.put("numero", supportConsultRequest.getNumero().toString());
       
        try {
            SupportResponse supportResponse = MethodHttp.get(API_URL+VOUCHER_ENDPOINT, params, token, SupportResponse.class);
            if(supportResponse == null || supportResponse.getData() == null || supportResponse.getData().getPaymentVoucherDto() == null) {
                return Optional.empty();
            }
            return Optional.of(supportResponse.getData().getPaymentVoucherDto());
        } catch (CustomHttpException e) {
            System.err.println("Error HTTP: " + e.getMessage());
            return Optional.empty();
        }
    }
    
    public static Optional<SupportResponse> updatePaymentVoucher(PaymentVoucherRequest paymentVoucherRequest) throws IOException {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        try {
           SupportResponse supportResponse = MethodHttp.put(API_URL+VOUCHER_ENDPOINT, token, paymentVoucherRequest, SupportResponse.class);
           if(supportResponse == null || supportResponse.getMessage() == null || supportResponse.getIsSuccess() == null) {
               return Optional.empty();
           }
           return Optional.of(supportResponse);
        } catch (CustomHttpException e) {
            System.err.println("Error HTTP: " + e.getMessage());
            return Optional.empty();
        } catch (IllegalArgumentException e) {
            System.err.println("Error en los parámetros: " + e.getMessage());
            throw e;
        } catch (IOException e) {
            System.err.println("Error inesperado de conexión: " + e.getMessage());
            throw e; 
        }
    }
    
    public static Optional<GuiaDto> getGuia(SupportConsultRequest supportConsultRequest) throws IOException {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        
        Map<String, String> params = new HashMap<>();
        params.put("ruc", supportConsultRequest.getRucEmisor());
        params.put("tipoComprobante", supportConsultRequest.getTipoComprobante());
        params.put("serie", supportConsultRequest.getSerie());
        params.put("numero", supportConsultRequest.getNumero().toString());
        
        try {
            SupportResponse supportResponse = MethodHttp.get(API_URL+GUIA_ENDPOINT, params, token, SupportResponse.class);
            if(supportResponse == null || supportResponse.getData() == null || supportResponse.getData().getGuiaDto() == null) {
                return Optional.empty();
            }
            return Optional.of(supportResponse.getData().getGuiaDto());
        } catch (CustomHttpException e) {
            System.err.println("Error HTTP: " + e.getMessage());
            return Optional.empty();
        }
    }
    
    public static Optional<SupportResponse> updateGuia(GuiaRequest guiaRequest) throws IOException {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        try {
            SupportResponse supportResponse = MethodHttp.put(API_URL+GUIA_ENDPOINT, token, guiaRequest, SupportResponse.class);
            if(supportResponse == null || supportResponse.getMessage() == null || supportResponse.getIsSuccess() == null) {
                return Optional.empty();
            }
            return Optional.of(supportResponse);
        } catch (CustomHttpException e) {
            System.err.println("Error HTTP: " + e.getMessage());
            return Optional.empty();
        } catch (IllegalArgumentException e) {
            System.err.println("Error en los parámetros: " + e.getMessage());
            throw e;
        } catch (IOException e) {
            System.err.println("Error inesperado de conexión: " + e.getMessage());
            throw e; 
        }
    }
    
    public static Optional<String> getUserToken(Long userId) throws IOException {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        
        Map<String, String> params = new HashMap<>();
        
        try {
            UserTokenResponse userTokenResponse = MethodHttp.get(API_URL+TOKEN_ENDPOINT+"/"+userId, params, token, UserTokenResponse.class);
            if(userTokenResponse == null || userTokenResponse.getToken() == null) {
                return Optional.empty();
            }
            return Optional.of(userTokenResponse.getToken());
        }  catch (CustomHttpException e) {
            System.err.println("Error HTTP: " + e.getMessage());
            return Optional.empty();
        }
    }
    
    public static List<UserDto2> getUserList(String ruc) throws IOException {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        
        Map<String, String> params = new HashMap<>();
        params.put("ruc", ruc);
       
        try {
            SupportResponse supportResponse = MethodHttp.get(API_URL+USER_ENDPOINT, params, token, SupportResponse.class);
            if(supportResponse == null || supportResponse.getData() == null || supportResponse.getData().getUserDtoList() == null) {
                return new ArrayList<>();
            }
            return supportResponse.getData().getUserDtoList();
        } catch (CustomHttpException e) {
            System.err.println("Error HTTP: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    public static Optional<SupportResponse> updateUser(UserRequest userRequest) throws IOException {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        try {
            SupportResponse supportResponse = MethodHttp.put(API_URL+USER_ENDPOINT, token, userRequest, SupportResponse.class);
            if(supportResponse == null || supportResponse.getMessage() == null || supportResponse.getIsSuccess() == null) {
                return Optional.empty();
            }
            return Optional.of(supportResponse);
        } catch (CustomHttpException e) {
            System.err.println("Error HTTP: " + e.getMessage());
            return Optional.empty();
        } catch (IllegalArgumentException e) {
            System.err.println("Error en los parámetros: " + e.getMessage());
            throw e;
        } catch (IOException e) {
            System.err.println("Error inesperado de conexión: " + e.getMessage());
            throw e; 
        }
    }
    
    public static Optional<SupportResponse> changePassword(ChangePasswordRequest changePasswordRequest) throws IOException {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        
        try {
            SupportResponse supportResponse = MethodHttp.put(API_URL+USER_ENDPOINT+CHANGE_PASSWORD_ENDPOINT, token, changePasswordRequest, SupportResponse.class);
            if(supportResponse == null || supportResponse.getMessage() == null || supportResponse.getIsSuccess() == null) {
                return Optional.empty();
            }
            return Optional.of(supportResponse);
        } catch (CustomHttpException e) {
            System.err.println("Error HTTP: " + e.getMessage());
            return Optional.empty();
        } catch (IllegalArgumentException e) {
            System.err.println("Error en los parámetros: " + e.getMessage());
            throw e;
        } catch (IOException e) {
            System.err.println("Error inesperado de conexión: " + e.getMessage());
            throw e; 
        }
    }
    
    public static Optional<InfoDownloadDto> consultDataToDownload(String ruc, String fechaInicio, String fechaFinal) throws IOException {
        String token = ConfigFile.obtenerToken();
        String API_URL = ConfigFile.obtenerUrl();
        Map<String, String> params = new HashMap<>();
        params.put("ruc", ruc);
        params.put("fechaInicio", fechaInicio);
        params.put("fechaFinal", fechaFinal);
        
        try {
            SupportResponse supportResponse = MethodHttp.get(API_URL+CONSULT_DOWNLOAD_ENDPOINT, params, token, SupportResponse.class);
            if(supportResponse == null || supportResponse.getData() == null || supportResponse.getData().getInfoDownloadDto() == null) {
                return Optional.empty();
            }
            return Optional.of(supportResponse.getData().getInfoDownloadDto());
        } catch (CustomHttpException e) {
            System.err.println("Error HTTP: " + e.getMessage());
            return Optional.empty();
        }
    }
    
}