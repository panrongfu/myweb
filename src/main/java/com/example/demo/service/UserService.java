package com.example.demo.service;

import com.example.demo.model.UserBean;

public interface UserService {
    UserBean login(String name, String password);
}
