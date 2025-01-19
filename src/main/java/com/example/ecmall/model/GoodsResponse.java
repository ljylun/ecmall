package com.example.ecmall.model;

public class GoodsResponse {
    // 表示操作结果
    private boolean result;

    public GoodsResponse(boolean result) {
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