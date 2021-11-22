package com.fang.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

public class WebApplicationContextUtil {

    public static ApplicationContext getWebApplicationContext(ServletContext servletContext){
        //这里用"app"，那么在对应的监听器（ContextLoaderListener）中也要用相同的字符串”app“，这里建议用常量
        return (ApplicationContext) servletContext.getAttribute("app");
    }
}
