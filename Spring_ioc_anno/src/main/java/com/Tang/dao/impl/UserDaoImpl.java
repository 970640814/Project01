package com.Tang.dao.impl;

import com.Tang.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author Tang
 * @date 2021/11/5 - 16:00
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("Save Running...");
    }
}
