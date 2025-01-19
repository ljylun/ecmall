package com.example.ecmall.dto;

import lombok.Data;

@Data
public class SendDeliveryResponse extends BaseResponse{
    private SendDeliveryResult result;
    @Data
    public static class SendDeliveryResult {
        private String shipmentSn;
        public SendDeliveryResult(String shipmentSn) {
            this.shipmentSn = shipmentSn;
        }
    }
}