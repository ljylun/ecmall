package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;

@Data
public class ProviderMessageResponse extends BaseResponse{
   private List<ProviderMessageResult> result;
   @Data
   public static class ProviderMessageResult{
        private String id;
        private Integer type;
        private String time;
        private String result;
       public ProviderMessageResult(String id, Integer type, String time, String result) {
           this.id = id;
           this.type = type;
           this.time = time;
           this.result = result;
       }
   }
}