package com.obs.eggplant.controller;

import com.obs.eggplant.Event.UserEvent;
import com.obs.eggplant.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @RequestMapping(value = "/listuser", method = RequestMethod.GET)
    public List<User> listUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("1", "Bob"));
        userList.add(new User("2", "Mike"));
        return userList;
    }

    @RequestMapping(value = "publishevent", method = RequestMethod.GET)
    public String publishEvent() {
        User user = new User("1", "Bob");
        UserEvent userEvent = new UserEvent(user);
        applicationEventPublisher.publishEvent(userEvent);
        return "success";
    }
}
