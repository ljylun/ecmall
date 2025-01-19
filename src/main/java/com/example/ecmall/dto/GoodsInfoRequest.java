package com.example.ecmall.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
public class GoodsInfoRequest {
    private String brandId;
    private String categoryId;
    private String goodsName;
    private String goodsUnit;
    private String intro;
    private String mobileIntro;
    private String manufacturerName;
    private String manufacturerCode;
    private BigDecimal taxRate;
    private List<SkuListResult> skuList;
    private String isRecommend;
    private String isShowOnly;
    private String priceRange;
    private String isPublic;
    private String departmentIds;
    private Integer miniBuyNum;
    private String stockType;
    private List<StockListResult> stockList;
    private List<String> images;
    private String inquiryGoodsFlag;
    private InquiryGoodsResult inquiryGoods;

    @Data
    public static class SkuListResult {
        private String skuNo;
        private BigDecimal price;
        private BigDecimal taxAmount;
        private BigDecimal netPrice;
        private BigDecimal jdPrice;
        private String jdLink;
        private BigDecimal marketPrice;
        private String owsLink;
        private String barCode;
        private String mallNo;
        private String weight;
        private List<SpecsDataResult> specsData;
    }

    @Data
    public static class SpecsDataResult{
        private String specName;
        private String specValue;
    }
    @Data
    public static class StockListResult {
        private String areaId;
        private Integer quantity;
    }
    @Data
    public static class InquiryGoodsResult{
        private String inquirySn;
        private String goodsDataId;
        private BigDecimal inquiryPrice;
    }
}