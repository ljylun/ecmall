package com.example.ecmall.dto;

import lombok.Data;

@Data
public class AccessTokenRequest {
    private String grantType;
    private String clientId;
    private String clientSecret;
    private String timestamp;
    private String userName;
    private String password;
    private String sign;
}