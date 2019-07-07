package com.obs.eggplant.service.impl;

import com.obs.eggplant.entity.User;
import com.obs.eggplant.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Integer id) {
        return new User("1", "Henry");
    }
}
