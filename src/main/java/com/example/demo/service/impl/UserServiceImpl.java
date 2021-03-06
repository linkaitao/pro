package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userMapper;

    public User selectUserByName(String name) {
        User user = userMapper.selectUserByName(name);
        return user ;
    };

    public User selectUserById(int id) {
        User user = userMapper.selectUserById(id);
        return user ;
    };

}
