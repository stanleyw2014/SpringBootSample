package com.obs.eggplant.service.impl;

import com.obs.eggplant.entity.User;
import com.obs.eggplant.service.UserService;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserServiceImpl implements UserService {

    private String injectClass;
    @PostConstruct
    void init(InjectionPoint ip){
        injectClass = ip.getDeclaredType().getName();
    }


    @Override
    public User getUserById(Integer id) {
        System.out.println(injectClass);
        return new User("1","Henry");
    }
}
