package com.Tang.SpringMVC.Test;

import com.Tang.SpringMVC.Dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tang
 * @date 2021/11/4 - 15:22
 */
public class SpringTest {

    @Test
    //测试Scope属性
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao user = (UserDao) context.getBean("userDao");
        System.out.println(user);
    }

}
