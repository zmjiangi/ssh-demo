package com.gzyijian.service.impl;

import com.gzyijian.dao.UserDao;
import com.gzyijian.entity.User;
import com.gzyijian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: zmjiangi
 * @date: 2019-1-24
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean add(User user) {
        this.userDao.add(user);
        return true;
    }

    @Override
    public boolean login(User user) {
        return this.userDao.login(user);
    }

    @Override
    public List getAll() {
        return this.userDao.getUser();
    }

    @Override
    public User getById(Integer id) {
        return this.userDao.getUser(id);
    }

    @Override
    public boolean update(User user) {
        this.userDao.update(user);
        return true;

    }

    @Override
    public boolean delete(Integer id) {
        this.userDao.delete(id);
        return true;
    }

}
