/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.payload.request;

public class CompanyRequest {
    
    private String ruc;
    private String nombreComercial;
    private String razonSocial;
    private String direccion;
    private String email;
    private Boolean envioAutomaticoSunat;
    private String estado;
    private String telefono;
    private Integer oseId;
    private Boolean viewGuia;
    private Boolean viewOtroComprobante;
    private Boolean viewCotizacion;

    public CompanyRequest() {
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEnvioAutomaticoSunat() {
        return envioAutomaticoSunat;
    }

    public void setEnvioAutomaticoSunat(Boolean envioAutomaticoSunat) {
        this.envioAutomaticoSunat = envioAutomaticoSunat;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getOseId() {
        return oseId;
    }

    public void setOseId(Integer oseId) {
        this.oseId = oseId;
    }

    public Boolean getViewGuia() {
        return viewGuia;
    }

    public void setViewGuia(Boolean viewGuia) {
        this.viewGuia = viewGuia;
    }

    public Boolean getViewOtroComprobante() {
        return viewOtroComprobante;
    }

    public void setViewOtroComprobante(Boolean viewOtroComprobante) {
        this.viewOtroComprobante = viewOtroComprobante;
    }

    public Boolean getViewCotizacion() {
        return viewCotizacion;
    }

    public void setViewCotizacion(Boolean viewCotizacion) {
        this.viewCotizacion = viewCotizacion;
    }
    
}
