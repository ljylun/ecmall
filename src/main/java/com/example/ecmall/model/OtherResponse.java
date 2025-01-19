package com.example.ecmall.model;

import java.util.List;

public class OtherResponse {
    // 存储结果列表
    private List<?> result;

    public OtherResponse(List<?> result) {
        this.result = result;
    }

    // 获取结果列表
    public List<?> getResult() {
        return result;
    }

    // 设置结果列表
    public void setResult(List<?> result) {
        this.result = result;
    }
}