package com.example.ecmall.dto;

import lombok.Data;

@Data
public class AccessTokenResponse extends BaseResponse{
    private AccessTokenResult result;

    @Data
    public static class AccessTokenResult {
        private String accessToken;
        private String refreshToken;
    }
}