package com.fang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TargetController {

    @RequestMapping("target")
    public ModelAndView target(ModelAndView modelAndView){
        System.out.println("目标资源执行中");
        modelAndView.setViewName("index");
        modelAndView.addObject("name","feifei");
        return modelAndView;
    }
}
