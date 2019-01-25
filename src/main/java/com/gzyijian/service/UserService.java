package com.gzyijian.service;


import com.gzyijian.entity.User;

import java.util.List;

/**
 * @author: zmjiangi
 * @date: 2019-1-24
 */
public interface UserService {

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    boolean add(User user);

    /**
     * 进行登录
     *
     * @param user
     * @return
     */
    boolean login(User user);

    /**
     * 获取所有的用户
     *
     * @return
     */
    List getAll();

    /**
     * 根据Id获取用户
     *
     * @param id
     * @return
     */
    User getById(Integer id);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    boolean update(User user);

    /**
     * 根据 id 删除用户
     *
     * @param id
     * @return
     */
    boolean delete(Integer id);

}
