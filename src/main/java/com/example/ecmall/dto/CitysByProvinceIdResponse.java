package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;

@Data
public class CitysByProvinceIdResponse extends BaseResponse{
   private List<CitysByProvinceIdResult> result;
    @Data
   public static class CitysByProvinceIdResult{
       private String id;
       private String name;
       private String parentId;
       private String level;
       private List<CitysByProvinceIdResult> children;

        public CitysByProvinceIdResult(String id, String name, String parentId, String level, List<CitysByProvinceIdResult> children) {
            this.id = id;
            this.name = name;
            this.parentId = parentId;
            this.level = level;
            this.children = children;
        }
    }
}