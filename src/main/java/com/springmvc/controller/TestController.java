package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("test")
public class TestController {
    @RequestMapping("do")
    @ResponseBody
    public void doSomething(){
        System.out.println("11111");
    }

    @RequestMapping("do1")
    public ModelAndView doSomething1(){
        System.out.println("22222");
        return new ModelAndView("");
    }

    @RequestMapping("do2")
    @ResponseBody
    public String doSomething2(){
        System.out.println("11111");
        return "测试不返回页面";
    }

    @RequestMapping("index")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
