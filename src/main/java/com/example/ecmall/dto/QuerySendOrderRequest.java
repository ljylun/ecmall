package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuerySendOrderRequest {
    private List<String> shipmentSn;
}