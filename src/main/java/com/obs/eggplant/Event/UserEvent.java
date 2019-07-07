package com.obs.eggplant.Event;

import com.obs.eggplant.entity.User;

public class UserEvent {
    User user;

    public UserEvent(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
