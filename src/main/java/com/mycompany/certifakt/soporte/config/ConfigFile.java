/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {
       
    private static final Properties properties = new Properties();
    
    public static void cargarConfiguracion() {
        String configFile = obtenerRutaConfig();
        File archivoConfig = new File(configFile);
        if (archivoConfig.exists()) {
            try (FileInputStream fis = new FileInputStream(archivoConfig)) {
                properties.load(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    private static String obtenerRutaConfig() {
        String directorioUsuario = System.getProperty("user.home");
        String carpetaConfig;

        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            carpetaConfig = directorioUsuario + File.separator + "AppData" + File.separator + "Local" + File.separator + "MiAplicacion";
        } else {
            carpetaConfig = directorioUsuario + File.separator + ".Certifakt-Soporte";
        }

        File directorio = new File(carpetaConfig);
        if (!directorio.exists()) {
            directorio.mkdirs();
        }
        
        String configFile = carpetaConfig + File.separator + "config.properties";
        File archivoConfig = new File(configFile);

        if (!archivoConfig.exists()) {
            try {
                archivoConfig.createNewFile();
                iniciarConfiguracionPredeterminada(configFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return configFile;
    }
    
    private static void iniciarConfiguracionPredeterminada(String configFile) {
        Properties properties = new Properties();
        properties.setProperty("api.url", "https://api.certifakt.com/");
        try (FileOutputStream fos = new FileOutputStream(configFile)) {
            properties.store(fos, "Configuración inicial de la aplicación");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String obtenerUrl() {
        return properties.getProperty("api.url");
    }
    
    public static void guardarUrl(String url) {
        properties.setProperty("api.url", url);
        String configFile = obtenerRutaConfig();
        try (FileOutputStream fos = new FileOutputStream(configFile)) {
            properties.store(fos, "URL de certifakt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String obtenerToken() {
        return properties.getProperty("user.token");
    }
    
    public static void guardarToken(String token) {
        properties.setProperty("user.token", token);
        String configFile = obtenerRutaConfig();
        try (FileOutputStream fos = new FileOutputStream(configFile)) {
            properties.store(fos, "Token de acceso");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void eliminarCredenciales() {
        properties.remove("user.token"); // Eliminar la clave del objeto properties
        String configFile = obtenerRutaConfig();
        try (FileOutputStream fos = new FileOutputStream(configFile)) {
            properties.store(fos, "Token eliminado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
