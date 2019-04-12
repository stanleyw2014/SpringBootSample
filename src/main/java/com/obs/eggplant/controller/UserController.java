package com.obs.eggplant.controller;

import com.obs.eggplant.entity.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    public List<User> listUsers(){
        List<User> userList = new ArrayList<>();
        userList.add(new User("1","Bob"));
        userList.add(new User("2","Mike"));
        return userList;
    }
}
