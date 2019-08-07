package com.cskaoyan.service;

import com.cskaoyan.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User queryUserById(int id);
    int insertUser(@Param("user")User user);
    User queryUserByUsername(@Param("username")String username);
}
