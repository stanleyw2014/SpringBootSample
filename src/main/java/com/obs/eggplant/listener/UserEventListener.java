package com.obs.eggplant.listener;

import com.obs.eggplant.Event.UserEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserEventListener {
    @EventListener
    public void handleUserEvent(UserEvent userEvent) {
        System.out.println(String.format("user id %s,user name %s", userEvent.getUser().getId(), userEvent.getUser().getName()));
    }
}
