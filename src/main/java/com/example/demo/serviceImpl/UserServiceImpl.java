package com.example.demo.serviceImpl;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.UserBean;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public UserBean login(String name, String password) {
        return userMapper.getInfo(name, password);
    }
}
