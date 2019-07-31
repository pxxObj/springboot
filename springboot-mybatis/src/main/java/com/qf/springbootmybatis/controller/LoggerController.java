package com.qf.springbootmybatis.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pxx
 * @date 2019/7/30
 */
@RestController
@RequestMapping("logger")
@Slf4j
public class LoggerController {

    //private Logger log = LoggerFactory.getLogger(LoggerController.class);

    @RequestMapping("log")
    public String  log(){
        log.debug("debug....");
        log.info("info....");
        log.warn("warn....");
        log.error("error....");
        return "ok";
    }
}
