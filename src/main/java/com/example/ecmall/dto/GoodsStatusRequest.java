package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;

@Data
public class GoodsStatusRequest {
    private List<String> skuList;
}