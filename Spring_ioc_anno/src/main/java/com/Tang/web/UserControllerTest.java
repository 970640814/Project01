package com.Tang.web;

import com.Tang.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @author Tang
 * @date 2021/11/5 - 16:27
 */
public class UserControllerTest {

    public static void main(String[] args) throws Exception{
        ApplicationContext context = new AnnotationConfigApplicationContext("com.Tang.config");
        UserService userService = (UserService) context.getBean("userService");
        userService.save();
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        System.out.println(dataSource.getConnection());
    }

}
