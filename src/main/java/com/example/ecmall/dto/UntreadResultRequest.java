package com.example.ecmall.dto;

import lombok.Data;

@Data
public class UntreadResultRequest {
    private String afterSaleSn;
    private Integer type;
    private String reason;
}