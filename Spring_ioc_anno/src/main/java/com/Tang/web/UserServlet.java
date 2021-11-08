package com.Tang.web;

import com.Tang.service.UserService;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Tang
 * @date 2021/11/6 - 19:45
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        //自己的工具类
//        ApplicationContext context = WebApplicationContextUtil.getApplicationContext(servletContext);
        ApplicationContext context = (ApplicationContext) servletContext.getAttribute("context");
        //spring-web提供的工具类
//        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        UserService userService = (UserService) context.getBean("userService");
        userService.save();
    }
}
