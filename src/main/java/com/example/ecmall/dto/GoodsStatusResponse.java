package com.example.ecmall.dto;

import lombok.Data;

import java.util.List;

@Data
public class GoodsStatusResponse extends BaseResponse{
    private List<GoodsStatusResult> result;
    @Data
    public static class GoodsStatusResult{
        private String skuNo;
        private Integer authFlag;
        private Integer marketEnable;
        private String underMessage;
        private String lastUnderTime;
        public GoodsStatusResult(String skuNo, Integer authFlag, Integer marketEnable, String underMessage, String lastUnderTime) {
            this.skuNo = skuNo;
            this.authFlag = authFlag;
            this.marketEnable = marketEnable;
            this.underMessage = underMessage;
            this.lastUnderTime = lastUnderTime;
        }
    }
}