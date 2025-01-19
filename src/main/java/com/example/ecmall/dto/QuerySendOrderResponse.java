package com.example.ecmall.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class QuerySendOrderResponse extends BaseResponse{
    private List<QuerySendOrderResult> result;
    @Data
    public static class QuerySendOrderResult{
        private String shipmentSn;
        private String createTime;
        private String orderSn;
        private BigDecimal sendOrderPrice;
        private String expressType;
        private String expressCustomaUrl;
        private String logisticsCode;
        private String logisticsName;
        private String expressNo;
        private String signStatus;
        private String signTime;
        private String customerServiceTime;
        private List<SkuListResult> skuList;
        @Data
        public static class SkuListResult{
            private String skuNo;
            private String goodsName;
            private BigDecimal price;
            private Integer num;

            public SkuListResult(String skuNo, String goodsName, BigDecimal price, Integer num) {
                this.skuNo = skuNo;
                this.goodsName = goodsName;
                this.price = price;
                this.num = num;
            }
        }

        public QuerySendOrderResult(String shipmentSn, String createTime, String orderSn, BigDecimal sendOrderPrice, String expressType, String expressCustomaUrl, String logisticsCode, String logisticsName, String expressNo, String signStatus, String signTime, String customerServiceTime, List<SkuListResult> skuList) {
            this.shipmentSn = shipmentSn;
            this.createTime = createTime;
            this.orderSn = orderSn;
            this.sendOrderPrice = sendOrderPrice;
            this.expressType = expressType;
            this.expressCustomaUrl = expressCustomaUrl;
            this.logisticsCode = logisticsCode;
            this.logisticsName = logisticsName;
            this.expressNo = expressNo;
            this.signStatus = signStatus;
            this.signTime = signTime;
            this.customerServiceTime = customerServiceTime;
            this.skuList = skuList;
        }
    }
}