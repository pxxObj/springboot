package com.qianfeng.springboothello.config;

import com.qianfeng.springboothello.filter.MyFilter;
import com.qianfeng.springboothello.listener.MyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author pxx
 * @date 2019/7/29
 */
@Configuration
public class WebConfig {

    @Autowired
    private MyFilter myFilter;

    @Autowired
    private MyListener myListener;

    public FilterRegistrationBean initFilterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setName("MyFilter");
        filterRegistrationBean.setFilter(myFilter);
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

    public ServletListenerRegistrationBean initListener(){
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(myListener);
        return servletListenerRegistrationBean;
    }
}

