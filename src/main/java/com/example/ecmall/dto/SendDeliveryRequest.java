package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;

@Data
public class SendDeliveryRequest {
    private String orderNo;
    private Integer sendType;
    private Integer expressType;
    private String expressCustomaUrl;
    private String logisticsCode;
    private String logisticsName;
    private String expressNo;
    private List<SkuListResult> skuList;

    @Data
    public static class SkuListResult{
        private String skuNo;
        private Integer num;
    }
}