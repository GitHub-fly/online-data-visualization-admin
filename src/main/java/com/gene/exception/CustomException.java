package com.gene.exception;


import com.gene.constant.ResultCode;

/**
 * @Description TODO
 * @Author smart-attendance
 * @Date 2020/6/10
 * @Version 1.0
 */
public class CustomException extends RuntimeException {
    protected ResultCode resultCode;

    public CustomException(String msg, ResultCode resultCode) {
        super(msg);
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

}
