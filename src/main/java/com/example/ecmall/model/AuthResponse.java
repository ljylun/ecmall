package com.example.ecmall.model;

public class AuthResponse {
    // 访问令牌
    private String accessToken;
    // 刷新令牌
    private String refreshToken;

    public AuthResponse(String accessToken, String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    // 获取访问令牌
    public String getAccessToken() {
        return accessToken;
    }

    // 设置访问令牌
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    // 获取刷新令牌
    public String getRefreshToken() {
        return refreshToken;
    }

    // 设置刷新令牌
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}