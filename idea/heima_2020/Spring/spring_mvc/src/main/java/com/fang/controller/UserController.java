package com.fang.controller;

import com.fang.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/quick" ,method = RequestMethod.GET , params = {"username"})
    public String save(){
        System.out.println("UserController  save  running...");
        //直接返回字符串，与视图解析器的前后缀进行拼接。
        return "/success";
    }


    @RequestMapping("/quick2")
    public ModelAndView save2(){
        ModelAndView modelAndView = new ModelAndView();
        //设置模型
        modelAndView.addObject("username","feifei2");
        //设置视图
        modelAndView.setViewName("success");
        return modelAndView;
    }

    //此处springmvc帮助注入ModelAndView对象
    @RequestMapping("/quick3")
    public ModelAndView save3(ModelAndView modelAndView){
        //设置模型
        modelAndView.addObject("username","feifei3");
        //设置视图
        modelAndView.setViewName("success");
        return modelAndView;
    }


    @RequestMapping("/quick4")
    public String save4(Model model){
        model.addAttribute("username","feifei4");
        return "success";
    }

    //request是原始请求对象，Model是springmvc封装的数据 。这里的request对象有springmvc帮注入
    @RequestMapping("/quick5")
    public String save5(HttpServletRequest request){
        request.setAttribute("username","feifei5");
        return "success";
    }

    @RequestMapping("/quick6")
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().print("feifei6");
    }

    @RequestMapping("/quick7")
    @ResponseBody //此注解告诉springmvc框架，不进行视图跳转，直接进行数据响应
    public String save7() {
        return "feife7";
    }
    @RequestMapping("/quick8")
    @ResponseBody
    public String save8() {
        return "{\"username\":\"feifei8\",\"age\":\"18\"}";
    }
    @RequestMapping("/quick9")
    @ResponseBody
    public String save9() throws JsonProcessingException {
        User user = new User();
        user.setUsername("feifei9");
        user.setAge("19");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping("/quick10")
    @ResponseBody
    public User save10()  {
        User user = new User();
        user.setUsername("feifei10");
        user.setAge("20");
        return user;
    }
}
