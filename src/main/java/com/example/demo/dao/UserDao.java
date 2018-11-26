package com.example.demo.dao;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper    //Mapper注解就是申明它是 @Repository层
@Repository
public interface UserDao {

    User selectUserByName(String name);

    User selectUserById(int id);
}