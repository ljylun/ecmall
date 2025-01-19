package com.example.ecmall.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class BillInfoResponse extends BaseResponse{
   private BillInfoResult result;
    @Data
   public static class BillInfoResult{
       private String settlementSn;
       private BigDecimal settlementPrice;
       private BigDecimal wirteWaitPrice;
       private BigDecimal wirteFinishPrice;
       private String departmentName;
       private String fullDepartmentName;
       private String settlementStatus;
       private String invoicingTime;
       private String invoiceTitle;
       private String taxNo;
       private String address;
       private String bankName;
       private String bankAccount;
       private String telephone;
       private String invoiceAddressName;
       private String invoiceAddressMobile;
       private String invoiceAddressPostCode;
       private String invoiceAddressAreaId;
       private String invoiceAddressAreaName;
       private String invoiceAddress;

        private List<SettlementItemListResult> settlementItemList;
        private List<SettlemenInvoiceListResult> settlemenInvoiceList;

        @Data
        public static class SettlementItemListResult{
            private String orderSn;
            private String settlementType;
            private BigDecimal orderPrice;
            public SettlementItemListResult(String orderSn, String settlementType, BigDecimal orderPrice) {
                this.orderSn = orderSn;
                this.settlementType = settlementType;
                this.orderPrice = orderPrice;
            }
        }
        @Data
        public static class SettlemenInvoiceListResult{
             private String invoiceTime;
              private String invoiceTitle;
              private String invoiceSn;
              private String invoiceType;
             private String invoiceUrl;
             private BigDecimal invoicePrice;
              private BigDecimal taxPrice;
              private String taxRate;
              private String status;
              private String expressType;
              private String expressCustomaUrl;
             private String logisticsCode;
             private String logisticsName;
            private String logisticsNo;
            public SettlemenInvoiceListResult(String invoiceTime, String invoiceTitle, String invoiceSn, String invoiceType, String invoiceUrl, BigDecimal invoicePrice, BigDecimal taxPrice, String taxRate, String status, String expressType, String expressCustomaUrl, String logisticsCode, String logisticsName, String logisticsNo) {
                this.invoiceTime = invoiceTime;
                this.invoiceTitle = invoiceTitle;
                this.invoiceSn = invoiceSn;
                this.invoiceType = invoiceType;
                this.invoiceUrl = invoiceUrl;
                this.invoicePrice = invoicePrice;
                this.taxPrice = taxPrice;
                this.taxRate = taxRate;
                this.status = status;
                this.expressType = expressType;
                this.expressCustomaUrl = expressCustomaUrl;
                this.logisticsCode = logisticsCode;
                this.logisticsName = logisticsName;
                this.logisticsNo = logisticsNo;
            }
        }
    }
}