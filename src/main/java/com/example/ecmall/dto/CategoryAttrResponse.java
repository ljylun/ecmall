package com.example.ecmall.dto;

import lombok.Data;

@Data
public class CategoryAttrResponse extends BaseResponse{
    private CategoryAttrResult result;
    @Data
    public static class CategoryAttrResult{
        private String categoryId;
        private String categoryName;
        private String categoryCode;
        private String parentId;
        private Integer level;
        private Integer sortOrder;

        public CategoryAttrResult(String categoryId, String categoryName, String categoryCode, String parentId, Integer level, Integer sortOrder) {
            this.categoryId = categoryId;
            this.categoryName = categoryName;
            this.categoryCode = categoryCode;
            this.parentId = parentId;
            this.level = level;
            this.sortOrder = sortOrder;
        }
    }
}