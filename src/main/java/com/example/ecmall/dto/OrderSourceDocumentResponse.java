package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderSourceDocumentResponse extends BaseResponse {
    private List<OrderSourceDocumentResult> result;
    @Data
    public static class OrderSourceDocumentResult {
        private String settlementSn;
        private String sn;
        private String status;
        private String transactionSn;
        private String fileUrl;

        public OrderSourceDocumentResult(String settlementSn, String sn, String status, String transactionSn, String fileUrl) {
            this.settlementSn = settlementSn;
            this.sn = sn;
            this.status = status;
            this.transactionSn = transactionSn;
            this.fileUrl = fileUrl;
        }
    }
}