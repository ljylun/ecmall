package com.example.ecmall.dto;

import lombok.Data;

@Data
public class RefreshTokenResponse extends BaseResponse{
    private RefreshTokenResult result;

    @Data
    public static class RefreshTokenResult {
        private String accessToken;
        private String refreshToken;
    }
}