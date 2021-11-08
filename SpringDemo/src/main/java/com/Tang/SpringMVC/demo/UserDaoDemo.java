package com.Tang.SpringMVC.demo;

import com.Tang.SpringMVC.Dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tang
 * @date 2021/11/4 - 15:09
 */
public class UserDaoDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao user = (UserDao) context.getBean("userDao");
        user.save();
    }
}
