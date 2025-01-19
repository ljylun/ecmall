package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;

@Data
public class GoodsCategoryResponse extends BaseResponse{
    private List<GoodsCategoryResult> result;
    @Data
    public static class GoodsCategoryResult{
        private String categoryId;
        private String categoryName;
        private String parentId;
        private List<GoodsCategoryResult> children;

        public GoodsCategoryResult(String categoryId, String categoryName, String parentId, List<GoodsCategoryResult> children) {
            this.categoryId = categoryId;
            this.categoryName = categoryName;
            this.parentId = parentId;
            this.children = children;
        }
    }
}