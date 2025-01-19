package com.example.ecmall.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class AfterSaleDetailResponse extends BaseResponse{
    private List<AfterSaleResult> result;
    @Data
    public static class AfterSaleResult{
        private String shipmentSn;
        private String serviceType;
        private String reason;
        private String memberName;
        private String afterSaleSn;
        private String serviceStatus;
        private String createtime;
        private String afterSaleImage;
        private List<SkuListResult> skuList;

        @Data
        public static class SkuListResult {
            private String skuNo;
            private String goodsName;
            private BigDecimal price;
            private Integer afetrSaleNum;
            private BigDecimal totalAfterSalePrice;

            public SkuListResult(String skuNo, String goodsName, BigDecimal price, Integer afetrSaleNum, BigDecimal totalAfterSalePrice) {
                this.skuNo = skuNo;
                this.goodsName = goodsName;
                this.price = price;
                this.afetrSaleNum = afetrSaleNum;
                this.totalAfterSalePrice = totalAfterSalePrice;
            }
        }

        public AfterSaleResult(String shipmentSn, String serviceType, String reason, String memberName, String afterSaleSn, String serviceStatus, String createtime, String afterSaleImage, List<SkuListResult> skuList) {
            this.shipmentSn = shipmentSn;
            this.serviceType = serviceType;
            this.reason = reason;
            this.memberName = memberName;
            this.afterSaleSn = afterSaleSn;
            this.serviceStatus = serviceStatus;
            this.createtime = createtime;
            this.afterSaleImage = afterSaleImage;
            this.skuList = skuList;
        }
    }
}