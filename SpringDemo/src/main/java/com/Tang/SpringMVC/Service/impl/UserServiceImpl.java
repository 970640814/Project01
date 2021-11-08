package com.Tang.SpringMVC.Service.impl;

import com.Tang.SpringMVC.Dao.UserDao;
import com.Tang.SpringMVC.Service.UserService;

/**
 * @author Tang
 * @date 2021/11/4 - 18:46
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }

}
