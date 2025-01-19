package com.example.ecmall.model;

import java.util.List;

public class MessageResponse {
    // 存储消息列表
    private List<?> result;

    public MessageResponse(List<?> result) {
        this.result = result;
    }

    // 获取消息列表
    public List<?> getResult() {
        return result;
    }

    // 设置消息列表
    public void setResult(List<?> result) {
        this.result = result;
    }
}