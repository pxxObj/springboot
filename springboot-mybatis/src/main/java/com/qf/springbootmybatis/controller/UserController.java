package com.qf.springbootmybatis.controller;

import com.qf.springbootmybatis.entity.TUser;
import com.qf.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pxx
 * @date 2019/7/29
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("getById/{id}")
    public TUser getById(@PathVariable("id") Long id){
        return userService.getById(id);
    }

}
