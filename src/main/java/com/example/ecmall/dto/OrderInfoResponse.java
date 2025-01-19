package com.example.ecmall.dto;


import java.math.BigDecimal;
import java.util.List;


public class OrderInfoResponse extends BaseResponse {
    private OrderInfoResult result;

    public OrderInfoResult getResult() {
        return result;
    }

    public void setResult(OrderInfoResult result) {
        this.result = result;
    }

    public static class OrderInfoResult {
        private String orderSn;
        private String memberName;
        private String mobile;
        private String twoTypeName;
        private String fenTypeName;
        private String departmentName;
        private String orderStatus;
        private String payType;
        private String payStatus;
        private String orderSuccessTime;
        private String consigneeName;
        private String consigneeMobile;
        private String consigneeAddressPath;
        private String consigneeAddressIdPath;
        private String consigneeDetail;
        private BigDecimal flowPrice;
        private BigDecimal noTaxPrice;
        private BigDecimal taxPrice;
        private BigDecimal realAmount;
        private BigDecimal drawback;
        private String remark;
        private String invoiceRemark;
        private String cancelReason;
        private String completeTime;
        private String customerServiceEndTime;
        private String clientType;
        private String invoiceAddressName;
        private String invoiceAddressMobile;
        private String invoiceAddressPostCode;
        private String invoiceAddressAreaId;
        private String invoiceAddressAreaName;
        private String invoiceAddress;
        private String invoiceTitle;
        private String bankName;
        private String bankAccount;
        private String taxNo;
        private String address;
        private String telephone;
        private String settlementStatus;
        private String orderType;
        private List<OrderItemResult> orderItemList;

        public String getOrderSn() {
            return orderSn;
        }

        public void setOrderSn(String orderSn) {
            this.orderSn = orderSn;
        }

        public String getMemberName() {
            return memberName;
        }

        public void setMemberName(String memberName) {
            this.memberName = memberName;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getTwoTypeName() {
            return twoTypeName;
        }

        public void setTwoTypeName(String twoTypeName) {
            this.twoTypeName = twoTypeName;
        }

        public String getFenTypeName() {
            return fenTypeName;
        }

        public void setFenTypeName(String fenTypeName) {
            this.fenTypeName = fenTypeName;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getPayType() {
            return payType;
        }

        public void setPayType(String payType) {
            this.payType = payType;
        }

        public String getPayStatus() {
            return payStatus;
        }

        public void setPayStatus(String payStatus) {
            this.payStatus = payStatus;
        }

        public String getOrderSuccessTime() {
            return orderSuccessTime;
        }

        public void setOrderSuccessTime(String orderSuccessTime) {
            this.orderSuccessTime = orderSuccessTime;
        }

        public String getConsigneeName() {
            return consigneeName;
        }

        public void setConsigneeName(String consigneeName) {
            this.consigneeName = consigneeName;
        }

        public String getConsigneeMobile() {
            return consigneeMobile;
        }

        public void setConsigneeMobile(String consigneeMobile) {
            this.consigneeMobile = consigneeMobile;
        }

        public String getConsigneeAddressPath() {
            return consigneeAddressPath;
        }

        public void setConsigneeAddressPath(String consigneeAddressPath) {
            this.consigneeAddressPath = consigneeAddressPath;
        }

        public String getConsigneeAddressIdPath() {
            return consigneeAddressIdPath;
        }

        public void setConsigneeAddressIdPath(String consigneeAddressIdPath) {
            this.consigneeAddressIdPath = consigneeAddressIdPath;
        }

        public String getConsigneeDetail() {
            return consigneeDetail;
        }

        public void setConsigneeDetail(String consigneeDetail) {
            this.consigneeDetail = consigneeDetail;
        }

        public BigDecimal getFlowPrice() {
            return flowPrice;
        }

        public void setFlowPrice(BigDecimal flowPrice) {
            this.flowPrice = flowPrice;
        }

        public BigDecimal getNoTaxPrice() {
            return noTaxPrice;
        }

        public void setNoTaxPrice(BigDecimal noTaxPrice) {
            this.noTaxPrice = noTaxPrice;
        }

        public BigDecimal getTaxPrice() {
            return taxPrice;
        }

        public void setTaxPrice(BigDecimal taxPrice) {
            this.taxPrice = taxPrice;
        }

        public BigDecimal getRealAmount() {
            return realAmount;
        }

        public void setRealAmount(BigDecimal realAmount) {
            this.realAmount = realAmount;
        }

        public BigDecimal getDrawback() {
            return drawback;
        }

        public void setDrawback(BigDecimal drawback) {
            this.drawback = drawback;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getInvoiceRemark() {
            return invoiceRemark;
        }

        public void setInvoiceRemark(String invoiceRemark) {
            this.invoiceRemark = invoiceRemark;
        }

        public String getCancelReason() {
            return cancelReason;
        }

        public void setCancelReason(String cancelReason) {
            this.cancelReason = cancelReason;
        }

        public String getCompleteTime() {
            return completeTime;
        }

        public void setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
        }

        public String getCustomerServiceEndTime() {
            return customerServiceEndTime;
        }

        public void setCustomerServiceEndTime(String customerServiceEndTime) {
            this.customerServiceEndTime = customerServiceEndTime;
        }

        public String getClientType() {
            return clientType;
        }

        public void setClientType(String clientType) {
            this.clientType = clientType;
        }

        public String getInvoiceAddressName() {
            return invoiceAddressName;
        }

        public void setInvoiceAddressName(String invoiceAddressName) {
            this.invoiceAddressName = invoiceAddressName;
        }

        public String getInvoiceAddressMobile() {
            return invoiceAddressMobile;
        }

        public void setInvoiceAddressMobile(String invoiceAddressMobile) {
            this.invoiceAddressMobile = invoiceAddressMobile;
        }

        public String getInvoiceAddressPostCode() {
            return invoiceAddressPostCode;
        }

        public void setInvoiceAddressPostCode(String invoiceAddressPostCode) {
            this.invoiceAddressPostCode = invoiceAddressPostCode;
        }

        public String getInvoiceAddressAreaId() {
            return invoiceAddressAreaId;
        }

        public void setInvoiceAddressAreaId(String invoiceAddressAreaId) {
            this.invoiceAddressAreaId = invoiceAddressAreaId;
        }

        public String getInvoiceAddressAreaName() {
            return invoiceAddressAreaName;
        }

        public void setInvoiceAddressAreaName(String invoiceAddressAreaName) {
            this.invoiceAddressAreaName = invoiceAddressAreaName;
        }

        public String getInvoiceAddress() {
            return invoiceAddress;
        }

        public void setInvoiceAddress(String invoiceAddress) {
            this.invoiceAddress = invoiceAddress;
        }

        public String getInvoiceTitle() {
            return invoiceTitle;
        }

        public void setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
        }

        public String getBankName() {
            return bankName;
        }

        public void setBankName(String bankName) {
            this.bankName = bankName;
        }

        public String getBankAccount() {
            return bankAccount;
        }

        public void setBankAccount(String bankAccount) {
            this.bankAccount = bankAccount;
        }

        public String getTaxNo() {
            return taxNo;
        }

        public void setTaxNo(String taxNo) {
            this.taxNo = taxNo;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTelephone() {
            return telephone;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public String getSettlementStatus() {
            return settlementStatus;
        }

        public void setSettlementStatus(String settlementStatus) {
            this.settlementStatus = settlementStatus;
        }

        public String getOrderType() {
            return orderType;
        }

        public void setOrderType(String orderType) {
            this.orderType = orderType;
        }

        public List<OrderItemResult> getOrderItemList() {
            return orderItemList;
        }

        public void setOrderItemList(List<OrderItemResult> orderItemList) {
            this.orderItemList = orderItemList;
        }



    }
}
