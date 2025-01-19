package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;

@Data
public class GoodsBrandResponse extends BaseResponse{
    private List<GoodsBrandResult> result;
    @Data
    public static class GoodsBrandResult{
        private Long brandId;
        private String brandName;

        public GoodsBrandResult(Long brandId, String brandName) {
            this.brandId = brandId;
            this.brandName = brandName;
        }
    }
}