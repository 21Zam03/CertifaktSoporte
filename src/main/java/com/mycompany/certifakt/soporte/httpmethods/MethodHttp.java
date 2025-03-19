/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.httpmethods;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.mycompany.certifakt.soporte.exception.CustomHttpException;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class MethodHttp {
    private static final OkHttpClient client = new OkHttpClient();
    private static final Gson gson = new Gson();
    private static final Logger logger = Logger.getLogger(MethodHttp.class.getName());
    
    public static <T> T post(String url, String token, Object requestBody, Class<T> responseType) {
        String jsonBody = gson.toJson(requestBody);

        RequestBody body = RequestBody.create(jsonBody, MediaType.get("application/json; charset=utf-8"));

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .addHeader("Authorization", token != null && !token.trim().isEmpty() ? "Bearer "+ token : "")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                return gson.fromJson(response.body().string(), responseType);
            } else {
                System.out.println("Error en la solicitud: " + response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static <T> T get(String baseUrl, Map<String, String> params, String bearerToken, Class<T> responseType) throws IOException {
        if (baseUrl == null || baseUrl.isEmpty()) {
            throw new IllegalArgumentException("La URL base no puede ser nula o vacía");
        }
        
        HttpUrl.Builder urlBuilder = HttpUrl.parse(baseUrl).newBuilder();
        if (params != null) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                urlBuilder.addQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        String url = urlBuilder.build().toString();

        Request.Builder requestBuilder = new Request.Builder().url(url).get();
        if (bearerToken != null && !bearerToken.isEmpty()) {
            requestBuilder.addHeader("Authorization", "Bearer " + bearerToken);
        }
        
        Request request = requestBuilder.build();
        logger.log(Level.INFO, "GET REQUEST: {0}", request);
        
        try (Response response = client.newCall(request).execute()) {
            int statusCode = response.code();
            ResponseBody responseBody = response.body();
            String responseBodyString = responseBody != null ? responseBody.string() : "Respuesta vacía";
            
            if (!response.isSuccessful()) {
                logger.log(Level.WARNING, "ERROR RESPONSE ({0}): {1}", new Object[]{statusCode, responseBodyString});
                try {
                    JsonObject jsonError = JsonParser.parseString(responseBodyString).getAsJsonObject();
                    String mensajeError = jsonError.has("mensaje") ? jsonError.get("mensaje").getAsString() : "Error desconocido";
                    throw new CustomHttpException(response.code(), mensajeError);
                } catch (JsonSyntaxException e) {
                    throw new CustomHttpException(response.code(), "No se pudo leer el JSON: "+e.getMessage());
                }
            }
            logger.log(Level.INFO, "RESPONSE ({0}): {1}", new Object[]{statusCode, responseBody});
            return gson.fromJson(responseBodyString, responseType);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "ERROR INESPERADO: {0} ", e.getMessage());
            throw new CustomHttpException(-1, "Error inesperado: "+e.getMessage());
        }
    }

    public static <T> T put(String url, String token, Object requestBody, Class<T> responseType) throws IOException {
        if(url == null || token == null || requestBody == null) {
            throw new IllegalArgumentException("La url, token o el cuerpo de la solicitud estan nulos o vacios");
        }
        
        String jsonBody = gson.toJson(requestBody);
        
        RequestBody body = RequestBody.create(jsonBody, MediaType.get("application/json; charset=utf-8"));
        
        Request request = new Request.Builder()
                .url(url)
                .put(body)
                .addHeader("Authorization", "Bearer " + token)
                .addHeader("Content-Type", "application/json")
                .build();
        logger.log(Level.INFO, "PUT REQUEST: {0} BodyRequest: {1}", new Object[]{request, jsonBody});
        
        try (Response response = client.newCall(request).execute()) {
            int statusCode = response.code();
            ResponseBody responseBody = response.body();
            String responseBodyString = responseBody != null ? responseBody.string() : "Respuesta vacía";
            
            if (!response.isSuccessful()) {
                logger.log(Level.WARNING, "ERROR RESPONSE ({0}): {1}", new Object[]{statusCode, responseBodyString});
                try {
                    JsonObject jsonError = JsonParser.parseString(responseBodyString).getAsJsonObject();
                    String mensajeError = jsonError.has("mensaje") ? jsonError.get("mensaje").getAsString() : "Error desconocido";
                    throw new CustomHttpException(response.code(), mensajeError);
                } catch (JsonSyntaxException e) {
                    throw new CustomHttpException(response.code(), "No se pudo leer el JSON: "+e.getMessage());
                }
            } 
            logger.log(Level.INFO, "RESPONSE ({0}): {1}", new Object[]{statusCode, responseBody});
            return gson.fromJson(responseBodyString, responseType);
      
        } catch (Exception e) {
            logger.log(Level.SEVERE, "ERROR INESPERADO: {0} ", e.getMessage());
            throw new CustomHttpException(-1, "Error inesperado: "+e.getMessage());
        }
    }
    
    
}
