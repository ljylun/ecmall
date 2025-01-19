package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;

@Data
public class GoodsStandardResponse extends BaseResponse{
    private List<GoodsStandardResult> result;
    @Data
    public static class GoodsStandardResult{
        private String id;
        private String categoryId;
        private String mallNo;
        private String mallName;

        public GoodsStandardResult(String id, String categoryId, String mallNo, String mallName) {
            this.id = id;
            this.categoryId = categoryId;
            this.mallNo = mallNo;
            this.mallName = mallName;
        }
    }
}