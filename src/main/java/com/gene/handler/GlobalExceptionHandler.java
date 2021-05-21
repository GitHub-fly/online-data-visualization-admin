package com.gene.handler;

import com.gene.constant.ResponseResult;
import com.gene.constant.ResultCode;
import com.gene.exception.CustomException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Description TODO
 * @author online-data
 * @Date 2021/5/21
 * @Version 1.0
 */
@RestControllerAdvice(annotations = {RestController.class, Controller.class})
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 统一运行时异常处理
     *
     * @param e
     * @return
     */
//    @ExceptionHandler
    @ResponseBody
    public ResponseResult dealWithException(Exception e) {
        return ResponseResult.failure(ResultCode.RESULT_CODE_DATA_NONE);
    }

    /**
     * 自定义异常的处理，统一在这里捕获返回JSON格式的友好提示
     *
     * @param customException
     * @return ResponseResult
     */
    @ExceptionHandler(value = {CustomException.class})
    @ResponseBody
    public ResponseResult handleCustomException(CustomException customException) {
        return ResponseResult.failure(customException.getResultCode());
    }

}