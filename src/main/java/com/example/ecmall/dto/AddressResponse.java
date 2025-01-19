package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;

@Data
public class AddressResponse extends BaseResponse {
    private List<AddressResult> result;
    @Data
    public static class AddressResult {
        private String id;
        private String name;

        public AddressResult(String id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}