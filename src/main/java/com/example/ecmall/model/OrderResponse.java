package com.example.ecmall.model;

public class OrderResponse {
    // 表示操作结果
    private boolean result;

    public OrderResponse(boolean result) {
        this.result = result;
    }

    // 获取操作结果
    public boolean isResult() {
        return result;
    }

    // 设置操作结果
    public void setResult(boolean result) {
        this.result = result;
    }
}