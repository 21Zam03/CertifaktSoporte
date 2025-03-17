/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certifakt.soporte.payload.wrapper;

import com.google.gson.annotations.SerializedName;
import com.mycompany.certifakt.soporte.payload.dto.CompanyDto;
import com.mycompany.certifakt.soporte.payload.dto.GuiaDto;
import com.mycompany.certifakt.soporte.payload.dto.PaymentVoucherDto;
import com.mycompany.certifakt.soporte.payload.dto.UserDto2;
import java.util.List;

public class DataWrapper {
    
    private CompanyDto companyDto;
    
    @SerializedName("paymentVoucher")
    private PaymentVoucherDto paymentVoucherDto;
    
    private GuiaDto guiaDto;
    
    private List<UserDto2> UserDtoList;

    public List<UserDto2> getUserDtoList() {
        return UserDtoList;
    }

    public void setUserDtoList(List<UserDto2> UserDtoList) {
        this.UserDtoList = UserDtoList;
    }
    
    public CompanyDto getCompanyDto() {
        return companyDto;
    }

    public GuiaDto getGuiaDto() {
        return guiaDto;
    }

    public void setGuiaDto(GuiaDto guiaDto) {
        this.guiaDto = guiaDto;
    }

    public void setCompanyDto(CompanyDto companyDto) {
        this.companyDto = companyDto;
    }

    public PaymentVoucherDto getPaymentVoucherDto() {
        return paymentVoucherDto;
    }

    public void setPaymentVoucherDto(PaymentVoucherDto paymentVoucherDto) {
        this.paymentVoucherDto = paymentVoucherDto;
    }
    
}
