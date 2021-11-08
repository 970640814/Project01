package com.Tang.SpringMVC.Dao.factory;

import com.Tang.SpringMVC.Dao.UserDao;
import com.Tang.SpringMVC.Dao.impl.UserDaoImpl;

/**
 * @author Tang
 * @date 2021/11/4 - 18:26
 */
public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
