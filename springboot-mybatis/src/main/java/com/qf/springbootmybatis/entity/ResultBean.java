package com.qf.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author pxx
 * @date 2019/7/30
 */
@Data
@AllArgsConstructor
public class ResultBean<T> {

    private String responseCode;
    private T data;
}
