package com.wyj.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author WYJ  misaka20202@gmail.com
 * @version 0.2
 * @ClassName: MyInter
 * @Description:
 * @date: 2020/20/07 下午 6:56
 * @since JDK 2.8
 */
public class MyInter2 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("22222拦截器的preHandle方法.......");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("22222拦截器的postHandle方法.......");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("2222222拦截器的afterCompletion方法.......");
    }
}
