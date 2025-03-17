/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.httpmethods;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MethodHttp {
    private static final OkHttpClient client = new OkHttpClient();
    private static final Gson gson = new Gson();
    
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
        System.out.println("REQUEST: "+request);
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful() || response.body() == null) {
                String errorBody = response.body() != null ? response.body().string() : "Respuesta vacía";
                System.out.println("ERROR RESPONSE: " + errorBody);
                // Intenta extraer el mensaje de error
                try {
                    JsonObject jsonError = JsonParser.parseString(errorBody).getAsJsonObject();
                    String mensajeError = jsonError.has("mensaje") ? jsonError.get("mensaje").getAsString() : "Error desconocido";
                    throw new IOException("Error en la solicitud: " + response.code() + " - " + mensajeError);
                } catch (JsonSyntaxException e) {
                    throw new IOException("Error en la solicitud: " + response.code() + " - No se pudo leer el JSON");
                }
            }
            String data = response.body().string();
            System.out.println("RESPONSE: "+data);
            return gson.fromJson(data, responseType);
        }
    }

    public static <T> T put(String url, String token, Object requestBody, Class<T> responseType) throws IOException {
        String jsonBody = gson.toJson(requestBody);
        
        RequestBody body = RequestBody.create(jsonBody, MediaType.get("application/json; charset=utf-8"));
        System.out.println("Body: "+jsonBody);
        Request request = new Request.Builder()
                .url(url)
                .put(body)
                .addHeader("Authorization", "Bearer " + token)
                .addHeader("Content-Type", "application/json")
                .build();
        System.out.println("REQUEST: "+request);
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
               return gson.fromJson(response.body().string(), responseType);
            } else {
                System.err.println("Error en la solicitud: " + response.code() + " - " + response.message());
                return null;
            }
        }
    }
    
    
}
