package com.zpy.controller;

import com.zpy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@ComponentScan(basePackages = "com.zpy")
public class ZPYController {

    @Autowired
    public User user;


    @GetMapping("hello")
    public String handle(){
        return user.say();

    }
}
