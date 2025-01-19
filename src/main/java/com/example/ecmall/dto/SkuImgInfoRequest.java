package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;

@Data
public class SkuImgInfoRequest {
    private String skuNo;
    private List<String> images;
}