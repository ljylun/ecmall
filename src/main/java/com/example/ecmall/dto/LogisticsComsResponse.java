package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;

@Data
public class LogisticsComsResponse extends BaseResponse{
    private List<LogisticsComsResult> result;
    @Data
    public static class LogisticsComsResult{
        private String code;
        private String name;

        public LogisticsComsResult(String code, String name) {
            this.code = code;
            this.name = name;
        }
    }
}