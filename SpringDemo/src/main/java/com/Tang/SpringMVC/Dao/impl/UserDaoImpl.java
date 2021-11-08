package com.Tang.SpringMVC.Dao.impl;

import com.Tang.SpringMVC.Dao.UserDao;

/**
 * @ahthor Tang
 * @date 2021/11/4 - 15:05
 */
public class UserDaoImpl implements UserDao {
    public UserDaoImpl(){
        System.out.println("创建UserDaoImpl...");
    }
    @Override
    public void save() {
        System.out.println("Save running...");
    }
}
