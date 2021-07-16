package com.fang.listener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        ServletContext servletContext = servletContextEvent.getServletContext();
        String  contextConfigLocation = (String) servletContext.getAttribute("contextConfigLocation");
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(contextConfigLocation);
        servletContext.setAttribute("app",app);
        System.out.println("spring容器创建完毕！");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
