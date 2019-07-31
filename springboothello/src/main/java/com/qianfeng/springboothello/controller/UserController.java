package com.qianfeng.springboothello.controller;

import com.qianfeng.springboothello.entity.Resource;
import com.qianfeng.springboothello.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author pxx
 * @date 2019/7/29
 */
@RestController  //使用这个注解，下面得方法就不需要加@ResponseBody注解
@RequestMapping("user")
public class UserController {

    /*@Value("${images.serverpath}")
    private String imagesPath;

    @Value("${email.serverpath}")
    private String emailPath;*/

    @Autowired
    private Resource resource;

    @RequestMapping("hello")
    public String hello(){
        return "hello,springboot!!!!!";
    }

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping("page")
    public String page(@RequestParam(name = "pageIndex",required = false,defaultValue = "1") Integer pageIndex){
        return "pageIndex:"+pageIndex;
    }

    @GetMapping("page/{pageIndex}")
    public String page2(@PathVariable Integer pageIndex){
        return "pageIndex:"+pageIndex;
    }

    @PostMapping("add")
    public User userAdd(User user){
        user.setEntryDate(new Date());
        //return user.getName()+":"+user.getPassword()+":"+user.getEntryDate();
        return user;
    }

    /*@RequestMapping("properties")
    public String properties(){
        return imagesPath+";"+emailPath;
    }*/

    @RequestMapping("bean")
    public String bean(){
        return resource.getImageServer()+";"+resource.getEmailServer();
    }

}
