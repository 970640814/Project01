package com.Tang.SpringMVC.demo;

import com.Tang.SpringMVC.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tang
 * @date 2021/11/4 - 18:52
 */
public class UserContorller {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.save();
    }

}
