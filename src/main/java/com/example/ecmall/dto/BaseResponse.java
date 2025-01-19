package com.example.ecmall.dto;



/**
 * BaseResponse类是所有响应类的基类，提供了基本的响应信息
 * 这包括请求是否成功，结果代码，以及结果消息
 */
public class BaseResponse {
    // 表示请求是否成功的标志
    private boolean success;

    // 结果代码，用于提供更详细的响应信息
    private String resultCode;

    // 结果消息，对响应结果的文本描述
    private String resultMessage;

    // 无参构造函数
    public BaseResponse() {
    }

    // 全参构造函数
    public BaseResponse(boolean success, String resultCode, String resultMessage) {
        this.success = success;
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }

    // 获取请求是否成功的标志
    public boolean isSuccess() {
        return success;
    }

    // 设置请求是否成功的标志
    public void setSuccess(boolean success) {
        this.success = success;
    }

    // 获取结果代码
    public String getResultCode() {
        return resultCode;
    }

    // 设置结果代码
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    // 获取结果消息
    public String getResultMessage() {
        return resultMessage;
    }

    // 设置结果消息
    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }
}
