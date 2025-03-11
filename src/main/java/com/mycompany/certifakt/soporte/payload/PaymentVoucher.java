/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.payload;

public class PaymentVoucher {
    
    private String fechaEmision;
    private String tipoComprobante;
    private String numero;
    private String receptor;
    private Double montoTotalVenta;
    private String estado;
    private String estadoSunat;

    public PaymentVoucher() {
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
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
        return "PaymentVoucher{" + "fechaEmision=" + fechaEmision + ", tipoComprobante=" + tipoComprobante + ", numero=" + numero + ", receptor=" + receptor + ", montoTotalVenta=" + montoTotalVenta + ", estado=" + estado + ", estadoSunat=" + estadoSunat + '}';
    }
    
}
