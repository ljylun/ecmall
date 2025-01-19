package com.example.ecmall.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SendInvoiceRequest {
    private String settlementSn;
    private String invoiceTime;
    private String invoiceTitle;
    private String invoiceSn;
    private String invoiceCode;
    private String bankName;
    private String bankAccount;
    private String taxNo;
    private String address;
    private String telephone;
    private String invoiceUrl;
    private BigDecimal invoicePrice;
    private BigDecimal noTaxPrice;
    private BigDecimal taxPrice;
    private BigDecimal taxRate;
    private Integer expressType;
    private String expressCustomaUrl;
    private String logisticsCode;
    private String logisticsName;
    private String logisticsNo;
}