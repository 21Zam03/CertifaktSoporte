/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.payload.dto;

public class UserDto2 {
    
    private Long userID;
    private String dni;
    private Boolean estado;
    private String fullName;
    private String password;
    private String typeUser;
    private String deLogin;
    private Boolean changePass;
    private Boolean pdfUnico;

    public UserDto2() {
    }

    public UserDto2(Long userID, String dni, Boolean estado, String fullName, String password, String typeUser, String deLogin, Boolean changePass, Boolean pdfUnico) {
        this.userID = userID;
        this.dni = dni;
        this.estado = estado;
        this.fullName = fullName;
        this.password = password;
        this.typeUser = typeUser;
        this.deLogin = deLogin;
        this.changePass = changePass;
        this.pdfUnico = pdfUnico;
    } 
    
    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }

    public String getDeLogin() {
        return deLogin;
    }

    public void setDeLogin(String deLogin) {
        this.deLogin = deLogin;
    }

    public Boolean getChangePass() {
        return changePass;
    }

    public void setChangePass(Boolean changePass) {
        this.changePass = changePass;
    }

    public Boolean getPdfUnico() {
        return pdfUnico;
    }

    public void setPdfUnico(Boolean pdfUnico) {
        this.pdfUnico = pdfUnico;
    }

    @Override
    public String toString() {
        return "UserDto2{" + "userID=" + userID + ", dni=" + dni + ", estado=" + estado + ", fullName=" + fullName + ", password=" + password + ", typeUser=" + typeUser + ", deLogin=" + deLogin + ", changePass=" + changePass + ", pdfUnico=" + pdfUnico + '}';
    }
 
}
