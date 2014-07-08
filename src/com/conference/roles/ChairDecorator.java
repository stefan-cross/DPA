package com.conference.roles;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 05/07/2014
 * Time: 14:35
 */
public class ChairDecorator extends RoleDecorator {
    public ChairDecorator(Role role) {
        super(role);
    }

    public void add() {
        System.out.println("Admin role granted");
        role.add();
    }

    public void createEvent(){
        System.out.println("Admin created event");
    }

    public void deleteEvent(){
        System.out.println("Admin deleted event");
    }
}
