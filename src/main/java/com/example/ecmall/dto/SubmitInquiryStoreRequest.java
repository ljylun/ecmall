package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;

@Data
public class SubmitInquiryStoreRequest {
    private String inquirySn;
    private String storeUserName;
    private String storeTelephone;
    private String storeSendTime;
    private String storeRemark;
    private List<GoodsPriceDataResult> goodsPriceData;

    @Data
    public static class GoodsPriceDataResult {
        private String goodsDataId;
        private String goodsName;
        private String brandName;
        private String specsData;
        private String price;
        private String netPrice;
        private String taxPrice;
        private String taxRate;
        private String marketPrice;
        private String goodsDesc;
        private String imagesUrl;
    }
}