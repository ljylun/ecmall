package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;
@Data
public class SkuStateRequest {
    private List<String> skuList;
    private Integer marketEnable;
}