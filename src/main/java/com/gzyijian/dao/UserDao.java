package com.gzyijian.dao;


import com.gzyijian.entity.User;

import java.util.List;

/**
 * @author: zmjiangi
 * @date: 2019-1-24
 */
public interface UserDao {
    /**
     * 添加并保存用户
     *
     * @param user
     */
    void add(User user);

    /**
     * 进行登录
     *
     * @param user
     * @return
     */
    boolean login(User user);


    /**
     * 获取用户列表
     *
     * @return
     */
    List getUser();

    /**
     * 根据用户Id获取用户信息
     *
     * @param id
     * @return
     */
    User getUser(int id);

    /**
     * 更新用户信息
     *
     * @param user
     */
    void update(User user);


    /**
     * 根据用户 id 删除用户信息
     *
     * @param id
     */
    void delete(int id);

}
