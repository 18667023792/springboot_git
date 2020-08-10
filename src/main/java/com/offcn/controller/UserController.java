package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    public void save(){
        System.out.println("xiaowang wrirte");
        System.out.println("this is me ");

        System.out.println("xiaowang wrirte2");
        System.out.println("this is me 2");
    }
}
