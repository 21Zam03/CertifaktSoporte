/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.payload.response;

public class UserTokenResponse {
    
    private String token;
    private Long expira;

    public UserTokenResponse() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getExpira() {
        return expira;
    }

    public void setExpira(Long expira) {
        this.expira = expira;
    }
    
    
}
