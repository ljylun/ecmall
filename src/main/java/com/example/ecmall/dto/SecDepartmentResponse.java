package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;
@Data
public class SecDepartmentResponse extends BaseResponse{
   private List<SecDepartmentResult> result;
    @Data
   public static class SecDepartmentResult{
       private String departmentId;
       private String departmentName;

        public SecDepartmentResult(String departmentId, String departmentName) {
            this.departmentId = departmentId;
            this.departmentName = departmentName;
        }
    }
}