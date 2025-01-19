package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;

@Data
public class SelfLogisticsResponse extends BaseResponse{
    private List<SelfLogisticsResult> result;

    @Data
    public static class SelfLogisticsResult{
        private String sendOrderNo;
        private List<OrderTrack> orderTrack;

        @Data
        public static class OrderTrack{
           private String content;
            private String msgTime;

            public OrderTrack(String content, String msgTime) {
                this.content = content;
                this.msgTime = msgTime;
            }
        }

        public SelfLogisticsResult(String sendOrderNo, List<OrderTrack> orderTrack) {
            this.sendOrderNo = sendOrderNo;
            this.orderTrack = orderTrack;
        }
    }
}