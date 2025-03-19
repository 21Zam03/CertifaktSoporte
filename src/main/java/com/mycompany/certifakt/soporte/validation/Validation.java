/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.validation;

import com.mycompany.certifakt.soporte.payload.request.SupportConsultRequest;

public class Validation {
    
    public static void validarSolicitud(SupportConsultRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("El cuerpo de la solicitud no puede ser nulo");
        }
        if (esNuloOVacio(request.getRucEmisor())) {
            throw new IllegalArgumentException("El ruc emisor no puede ser nulo o estar vacío");
        }
        if (esNuloOVacio(request.getTipoComprobante())) {
            throw new IllegalArgumentException("El tipo de comprobante no puede ser nulo o estar vacío");
        }
        if (esNuloOVacio(request.getSerie())) {
            throw new IllegalArgumentException("La serie no puede ser nula o estar vacía");
        }
        if (request.getNumero() == null) {
            throw new IllegalArgumentException("El número no puede ser nulo");
        }   
    }

    private static boolean esNuloOVacio(String valor) {
        return valor == null || valor.trim().isEmpty();
    }
    
    public static void validarString(String key, Object value) {
        if (value == null) {
            throw new IllegalArgumentException("Campo [" + key + "] no puede ser nulo");
        }
    
        if (value instanceof String && ((String) value).trim().isEmpty()) {
            throw new IllegalArgumentException("Campo [" + key + "] no puede ser vacío");
        }
    }
    
}
