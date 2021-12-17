package com.fang.controller;

import com.fang.domain.User;
import com.fang.domain.Vo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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













    //Controller中的业务方法的参数名称要与请求参数的name一致，参数值会自动映射匹配。
    @RequestMapping("/quick11")
    @ResponseBody
    public void save11(String username,int age)  {
        System.out.println(username);
        System.out.println(age);
    }


    @RequestMapping("/quick12")
    @ResponseBody
    public void save12(User user)  {
        System.out.println(user);
    }

    @RequestMapping("/quick13")
    @ResponseBody
    public void save13(String[] strs)  {
        System.out.println(strs);
        System.out.println(Arrays.asList(strs));
    }

    @RequestMapping("/quick14")
    @ResponseBody
    public void save14(Vo vo)  {
        System.out.println(vo);
    }

    @RequestMapping("/quick15")
    @ResponseBody
    public void save15(@RequestBody List<User> userList)  {
        System.out.println(userList);
    }


    @RequestMapping("/quick16")
    @ResponseBody
    public void save16(@RequestParam(value = "name", required = false, defaultValue = "lisi") String username) {
        System.out.println(username);
    }

    @RequestMapping(value = "/quick17/{name}")
    @ResponseBody
    public void save17(@PathVariable("name") String username) {
        System.out.println(username);
    }

    @RequestMapping(value = "/quick18")
    @ResponseBody
    public void save18(Date date) {
        System.out.println(date);
    }

    @RequestMapping(value = "/quick19")
    @ResponseBody
    public void save19(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
    }

    @RequestMapping(value = "/quick20")
    @ResponseBody
    public void save20(@RequestHeader("User-Agent") String userAgent) {
        System.out.println(userAgent);
    }

    @RequestMapping(value = "/quick21")
    @ResponseBody
    public void save21(@CookieValue("JSESSIONID") String jsessionId) {
        System.out.println(jsessionId);
    }

    @RequestMapping(value = "/quick22")
    @ResponseBody
    public void save22(String username, MultipartFile uploadFile) throws IOException {
        System.out.println(username);
        String originalFilename = uploadFile.getOriginalFilename();
        uploadFile.transferTo(new File("D:\\work_space\\upload\\"+originalFilename));
    }

    @RequestMapping(value = "/quick23")
    @ResponseBody
    public void save23(String username, MultipartFile[] uploadFile) throws IOException {
        System.out.println(username);
        for (MultipartFile multipartFile:uploadFile) {
            String originalFilename = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File("D:\\work_space\\upload\\"+originalFilename));
        }
    }








}
