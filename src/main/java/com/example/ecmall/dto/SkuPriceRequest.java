package com.example.ecmall.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SkuPriceRequest {
    private String skuNo;
    private BigDecimal price;
    private BigDecimal netPrice;
    private BigDecimal taxAmount;
    private BigDecimal marketPrice;
}