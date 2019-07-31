package com.qf.springbootmybatis.controller;

import com.qf.springbootmybatis.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author pxx
 * @date 2019/7/30
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @RequestMapping("register")
    public String register(@Valid Student student){
        System.out.println(student);
        return "success";
    }
}
