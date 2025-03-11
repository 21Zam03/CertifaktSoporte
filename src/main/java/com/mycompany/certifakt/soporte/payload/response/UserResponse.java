/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.payload.response;

public class UserResponse {
    private long id;
    private String username;
    private String fullName;
    private String dni;
    private String typeUser;
    private Boolean enabled;
    private Boolean changePass;
    private String lastPasswordResetDate;
    private Boolean estado;
    private Boolean hidecomprobante;
    private String passwordTemp;
    private Boolean pdfUnico;

    public UserResponse() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getChangePass() {
        return changePass;
    }

    public void setChangePass(Boolean changePass) {
        this.changePass = changePass;
    }

    public String getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }

    public void setLastPasswordResetDate(String lastPasswordResetDate) {
        this.lastPasswordResetDate = lastPasswordResetDate;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Boolean getHidecomprobante() {
        return hidecomprobante;
    }

    public void setHidecomprobante(Boolean hidecomprobante) {
        this.hidecomprobante = hidecomprobante;
    }

    public String getPasswordTemp() {
        return passwordTemp;
    }

    public void setPasswordTemp(String passwordTemp) {
        this.passwordTemp = passwordTemp;
    }

    public Boolean getPdfUnico() {
        return pdfUnico;
    }

    public void setPdfUnico(Boolean pdfUnico) {
        this.pdfUnico = pdfUnico;
    }
    
    
}
