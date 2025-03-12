/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.payload.response;

import com.mycompany.certifakt.soporte.payload.wrapper.DataWrapper;

public class SupportResponse {
    
    private String message;
    private Boolean isSuccess;
    private DataWrapper data;

    public SupportResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public DataWrapper getData() {
        return data;
    }

    public void setData(DataWrapper data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SupportResponse{" + "message=" + message + ", isSuccess=" + isSuccess + ", data=" + data + '}';
    }
    
}
