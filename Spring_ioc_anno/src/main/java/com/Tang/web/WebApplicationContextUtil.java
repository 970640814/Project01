package com.Tang.web;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * @author Tang
 * @date 2021/11/7 - 10:20
 */
public class WebApplicationContextUtil {

    public static ApplicationContext getApplicationContext(ServletContext servletContext){
        return (ApplicationContext) servletContext.getAttribute("context");
    }

}
