/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.payload.dto;

import java.util.List;

public class InfoDownloadDto {
    
    private String cliente;
    private Long cantidad;
    private Integer total;
    private Integer totalDescargas;
    private List<String> linksDescargas;

    public InfoDownloadDto() {
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotalDescargas() {
        return totalDescargas;
    }

    public void setTotalDescargas(Integer totalDescargas) {
        this.totalDescargas = totalDescargas;
    }

    public List<String> getLinksDescargas() {
        return linksDescargas;
    }

    public void setLinksDescargas(List<String> linksDescargas) {
        this.linksDescargas = linksDescargas;
    }
    
}
