package com.conference.builder;

import com.conference.licence.General;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 08/07/2014
 * Time: 20:29
 */
public class CreateEvent extends Conference {

    public Conference BuildEvent(){
        new General().getWelcome();
        // Create our conference event
        Conference event = new Conference();
        // or more inline with our singleton pattern
        CreateEvent.getInstance();

        event.notifyOfCreation();
        System.out.println(event.hashCode());

        // Create User
        event.setChair("Chairman Kim");
        System.out.println(event.getChair());

        // Event to take commandline params of name, location, date

        // Create topics
        return event;
    }
}
