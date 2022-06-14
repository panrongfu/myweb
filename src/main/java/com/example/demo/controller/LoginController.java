package com.example.demo.controller;

import com.example.demo.model.UserBean;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String name, String password) {
        UserBean userBean = userService.login(name, password);
        if (null == userBean) {
            return "error";
        } else {
            return "success";
        }
    }
}
