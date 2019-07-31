package com.qf.springbootmybatis.controller;

import com.qf.springbootmybatis.entity.TUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author pxx
 * @date 2019/7/30
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("hello")
    public String hello(Model model){
        int i=1/0;
        String username = "小马哥";
        TUser tUser = new TUser();
        tUser.setUsername("zs");
        List<TUser> list = new ArrayList<>();
        list.add(new TUser(1L,"zs","123"));
        list.add(new TUser(2L,"ls","123456"));
        list.add(new TUser(3L,"ww","1234"));

        Integer age = 18;
        Date birthday = new Date();
        Integer sex = 1;
        model.addAttribute("username",username);
        model.addAttribute("user",tUser);
        model.addAttribute("list",list);
        model.addAttribute("age",age);
        model.addAttribute("birthday",birthday);
        model.addAttribute("sex",sex);
        return "index";
    }
}
