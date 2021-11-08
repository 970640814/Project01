package com.Tang.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author Tang
 * @date 2021/11/7 - 9:56
 */
public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        String configLocation = servletContext.getInitParameter("configLocation");
        ApplicationContext context = new AnnotationConfigApplicationContext(configLocation);
        //将Spring的应用上下文对象存储到ServletContext域中
        servletContext.setAttribute("context",context);
        System.out.println("Spring容器创建完毕...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}

