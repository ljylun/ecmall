package com.example.ecmall.dto;

import lombok.Data;

@Data
public class OrderSourceDocumentRequest {
    private String settlementSn;
    private String sn;
}