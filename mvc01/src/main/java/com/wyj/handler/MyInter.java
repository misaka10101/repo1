package com.wyj.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author WYJ  misaka10101@gmail.com
 * @version 0.1
 * @ClassName: MyInter
 * @Description:
 * @date: 2020/10/07 下午 6:56
 * @since JDK 1.8
 */
public class MyInter implements HandlerInterceptor {

    private long t1;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        t1 = System.currentTimeMillis();
        System.out.println("11111拦截器的preHandle方法.......");
//        request.getRequestDispatcher("tip.jsp").forward(request,response);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("11111拦截器的postHandle方法.......");
//        modelAndView.setViewName("other");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("1111111拦截器的afterCompletion方法.......");
//        System.out.println("花费的时间: " + (System.currentTimeMillis() - t1) + "毫秒");
    }
}
