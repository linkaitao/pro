package com.example.demo.service;

import com.example.demo.domain.User;


public interface UserService {

    /**
     * 根据接口查询所用的用户
     */
    public User selectUserByName(String name);

    /**
     * 根据id查询用户
     * */
    public User selectUserById(int id);
}