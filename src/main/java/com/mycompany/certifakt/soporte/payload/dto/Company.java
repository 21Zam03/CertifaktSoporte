/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.payload.dto;

public class Company {
    
    private String direccion;
    private String razonSocial;
    private String nombreComercial;
    private String ruc;
    private String email;
    private Boolean envioAutomaticoSunat;
    private Integer cantComprobanteDinamico;
    private Integer format;
    private Boolean viewGuia;
    private Boolean rubroHoreal;
    private Boolean trial;
    private String ublVersion;

    public Company() {
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
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

    public Integer getCantComprobanteDinamico() {
        return cantComprobanteDinamico;
    }

    public void setCantComprobanteDinamico(Integer cantComprobanteDinamico) {
        this.cantComprobanteDinamico = cantComprobanteDinamico;
    }

    public Integer getFormat() {
        return format;
    }

    public void setFormat(Integer format) {
        this.format = format;
    }

    public Boolean getViewGuia() {
        return viewGuia;
    }

    public void setViewGuia(Boolean viewGuia) {
        this.viewGuia = viewGuia;
    }

    public Boolean getRubroHoreal() {
        return rubroHoreal;
    }

    public void setRubroHoreal(Boolean rubroHoreal) {
        this.rubroHoreal = rubroHoreal;
    }

    public Boolean getTrial() {
        return trial;
    }

    public void setTrial(Boolean trial) {
        this.trial = trial;
    }

    public String getUblVersion() {
        return ublVersion;
    }

    public void setUblVersion(String ublVersion) {
        this.ublVersion = ublVersion;
    } 
    
    
}
