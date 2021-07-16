package com.fang.service.impl;


import com.fang.dao.UserDao;
import com.fang.dao.impl.UserDaoImpl;
import com.fang.service.UserService;

public class UserServiceImpl implements UserService {


    private UserDao userDao;

    @Override
    public void save() {
        userDao.save();
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}
