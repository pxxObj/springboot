package com.qf.springbootmybatis.exception;

import com.qf.springbootmybatis.entity.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author pxx
 * @date 2019/7/30
 * 全局异常处理类
 */
@ControllerAdvice
public class CommonExceptionHandler {

    /*@ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handlerException(Exception e){
        return new ResultBean("500",e.getMessage());
    }*/

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handlerException(Exception e){
        return new ResultBean("500","您的操作有误！请稍后再试！☺");
    }
}
