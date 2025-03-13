/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.payload.dto;


public class GuiaDto {

    private Long guiaId;
    private String fechaEmision;
    private String tipoComprobante;
    private String serie;
    private Integer numero;
    private String numDocumIdentRemit;
    private String denominacionRemit;
    private String numDocumIdentDestin;
    private String denominacionDestin;
    private Double pesoTotal;
    private String estado;
    private String estadoSunat;

    public GuiaDto() {
    }

    public Long getGuiaId() {
        return guiaId;
    }

    public void setGuiaId(Long guiaId) {
        this.guiaId = guiaId;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNumDocumIdentRemit() {
        return numDocumIdentRemit;
    }

    public void setNumDocumIdentRemit(String numDocumIdentRemit) {
        this.numDocumIdentRemit = numDocumIdentRemit;
    }

    public String getDenominacionRemit() {
        return denominacionRemit;
    }

    public void setDenominacionRemit(String denominacionRemit) {
        this.denominacionRemit = denominacionRemit;
    }

    public String getNumDocumIdentDestin() {
        return numDocumIdentDestin;
    }

    public void setNumDocumIdentDestin(String numDocumIdentDestin) {
        this.numDocumIdentDestin = numDocumIdentDestin;
    }

    public String getDenominacionDestin() {
        return denominacionDestin;
    }

    public void setDenominacionDestin(String denominacionDestin) {
        this.denominacionDestin = denominacionDestin;
    }

    public Double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(Double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstadoSunat() {
        return estadoSunat;
    }

    public void setEstadoSunat(String estadoSunat) {
        this.estadoSunat = estadoSunat;
    }
    
}
