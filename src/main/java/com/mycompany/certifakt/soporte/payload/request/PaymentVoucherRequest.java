/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.payload.request;

public class PaymentVoucherRequest {
    
    private Long paymentVoucherId;
    private String fechaEmision;
    private String tipoComprobante;
    private String serie;
    private Integer numero;
    private String numDocIdentReceptor;
    private String denominacionReceptor;
    private Double montoTotalVenta;
    private String estado;
    private String estadoSunat;

    public PaymentVoucherRequest() {
    }

    public Long getPaymentVoucherId() {
        return paymentVoucherId;
    }

    public void setPaymentVoucherId(Long paymentVoucherId) {
        this.paymentVoucherId = paymentVoucherId;
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

    public String getNumDocIdentReceptor() {
        return numDocIdentReceptor;
    }

    public void setNumDocIdentReceptor(String numDocIdentReceptor) {
        this.numDocIdentReceptor = numDocIdentReceptor;
    }

    public String getDenominacionReceptor() {
        return denominacionReceptor;
    }

    public void setDenominacionReceptor(String denominacionReceptor) {
        this.denominacionReceptor = denominacionReceptor;
    }

    public Double getMontoTotalVenta() {
        return montoTotalVenta;
    }

    public void setMontoTotalVenta(Double montoTotalVenta) {
        this.montoTotalVenta = montoTotalVenta;
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

    @Override
    public String toString() {
        return "PaymentVoucherRequest{" + "paymentVoucherId=" + paymentVoucherId + ", fechaEmision=" + fechaEmision + ", tipoComprobante=" + tipoComprobante + ", serie=" + serie + ", numero=" + numero + ", numDocIdentReceptor=" + numDocIdentReceptor + ", denominacionReceptor=" + denominacionReceptor + ", montoTotalVenta=" + montoTotalVenta + ", estado=" + estado + ", estadoSunat=" + estadoSunat + '}';
    }
    
    
}
