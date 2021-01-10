package com.wyj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * @author WYJ  misaka10101@gmail.com
 * @version 0.1
 * @ClassName: MyController
 * @Description:
 * @date: 2020-09-17 上午 10:56
 * @since JDK 1.8
 */
@Controller
public class MyController {

    @RequestMapping(value = {"/some.do", "a.do"})
    public ModelAndView doSome(HttpServletResponse response) {
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("处理some.do请求");
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "111使用注解的springmvc应用");
        mv.addObject("fun", "doSome");
//        mv.setViewName("show");
//        mv.setViewName("forward:/hello.jsp");
        mv.setViewName("redirect:/hello.jsp");
        return mv;
    }

    @RequestMapping(value = {"/other.do", "b.do"})
    public ModelAndView doOther() {
        System.out.println("处理other.do请求");
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "doOther");
        mv.addObject("fun", "other");
        mv.setViewName("other");
        return mv;
    }

}
