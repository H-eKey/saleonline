package com.schekey.saleonline.service;

import com.schekey.saleonline.entity.User;
import com.schekey.saleonline.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserService {
    @Resource(name = "userMapper")
    private UserMapper userMapper;
    public List<User> getUser(){
        return userMapper.selectAll();
    }
}
