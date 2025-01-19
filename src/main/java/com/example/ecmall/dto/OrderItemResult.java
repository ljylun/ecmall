package com.example.ecmall.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderItemResult{
    private Integer shipmentStatus;
    private String shipmentSn;
    private List<SkuListResult> skuList;
    @Data
    public static class SkuListResult{
        private String skuNo;
        private String goodsName;
        private Integer num;
        private BigDecimal price;
        private String goodsUnit;

        public SkuListResult(String skuNo, String goodsName, Integer num, BigDecimal price, String goodsUnit) {
            this.skuNo = skuNo;
            this.goodsName = goodsName;
            this.num = num;
            this.price = price;
            this.goodsUnit = goodsUnit;
        }
    }
    public OrderItemResult(Integer shipmentStatus, String shipmentSn, List<SkuListResult> skuList) {
        this.shipmentStatus = shipmentStatus;
        this.shipmentSn = shipmentSn;
        this.skuList = skuList;
    }
}