package com.cskaoyan.service;

import com.cskaoyan.bean.User;
import com.cskaoyan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User queryUserById(int id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public User queryUserByUsername(String username) {
        return userMapper.queryUserByUsername(username);
    }
}
