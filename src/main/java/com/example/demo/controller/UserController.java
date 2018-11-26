package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.exception.MyException;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
// import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController //相当于@Controller与@ResponseBody
@RequestMapping(value = "user")
public class UserController {
    //依赖注入
    @Autowired
    private UserService userService;

    @RequestMapping(value = "find")
    @ResponseBody
    public User selectUserByName() {
        User user = userService.selectUserByName("jay");
        return user;
    }


    @RequestMapping(value = "{id}")
    @ResponseBody
    public User selectUserById(@PathVariable int id) {
        User user = userService.selectUserById(id);
        return user;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "add/{id}", method = RequestMethod.POST, produces = {"application/json;char=UTF-8"})
    @ResponseBody
    public Map addUser(@PathVariable int id,
                       @RequestBody User user,
                       HttpServletRequest request) throws Exception{
        if (user.getId() == 0) {
            throw new MyException("101", "Sam 错误");
        }
        Map map = new HashMap();
        map.put("code", "OK");
        map.put("msg", "gaga");
//        map.put("msg", "操作成功");
        return map;
    }


}