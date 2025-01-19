package com.example.ecmall.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class InquiryStoreResponse extends BaseResponse {
    private List<InquiryStoreResult> result;
    @Data
    public static class InquiryStoreResult{
        private String inquirySn;
        private String inquiryType;
        private String invoiceType;
        private String userName;
        private String telePhone;
        private String createTime;
        private String departmentName;
        private String closeTime;
        private String deliveryTime;
        private String expectPayTime;
        private String consigneeName;
        private String consigneeMobile;
        private String consigneeAddressPath;
        private String consigneeAddressIdPath;
        private String consigneeDetail;
        private String status;
        private String reason;
        private String storeRemark;
       private List<GoodsDataResult> goodsDataList;
       private List<InquiryStoreDataResult> inquiryStoreDataList;


        @Data
       public static class GoodsDataResult{
           private String goodsDataId;
           private String goodsName;
           private String brandName;
           private String specsData;
           private String goodsUnit;
           private Integer num;
           private BigDecimal price;
           private String remark;
           private String imagesUrl;

        }
        @Data
        public static class InquiryStoreDataResult{
            private Integer inquiryNumber;
            private BigDecimal totalPrice;
            private String createPriceTime;
            private List<InquiryStoreSkuDataResult> inquiryStoreSkuData;
            @Data
            public static class InquiryStoreSkuDataResult{
               private String goodsName;
               private String brandName;
               private String specsData;
               private BigDecimal price;
                private BigDecimal netPrice;
                private BigDecimal taxPrice;
                 private BigDecimal taxRate;
                private Integer num;
                private String goodsDesc;
                 private String goodsImage;
            }
        }

    }
}