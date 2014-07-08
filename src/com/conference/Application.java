package com.conference;

import com.conference.builder.Conference;
import com.conference.builder.CreateEvent;
import com.conference.roles.ChairDecorator;
import com.conference.roles.Role;
import com.conference.roles.UserDecorator;

public class Application {

    public static void main(String[] args) {

        Conference event = new CreateEvent().BuildEvent();

        Role role = new Role();
        UserDecorator user = new UserDecorator(role);
        ChairDecorator admin = new ChairDecorator(user);

        admin.add();


    }




}
