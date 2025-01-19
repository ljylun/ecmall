package com.example.ecmall.dto;

import lombok.Data;

@Data
public class RefreshTokenRequest {
    private String clientId;
    private String clientSecret;
    private String refreshToken;
}