package main.java.com.conference;

import main.java.com.conference.builder.Conference;
import main.java.com.conference.builder.CreateEvent;
import main.java.com.conference.roles.ChairDecorator;
import main.java.com.conference.roles.Role;
import main.java.com.conference.roles.UserDecorator;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        Conference event = new CreateEvent().BuildEvent();

        Role role = new Role();
        UserDecorator user = new UserDecorator(role);
        ChairDecorator admin = new ChairDecorator(user);

        admin.add();


    }




}
