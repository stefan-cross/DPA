package main.java.com.conference.roles;

import main.java.com.conference.User;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 14/07/2014
 * Time: 14:14
 */
public class Client {

    public static void main(String[] args){

        //User user = User.getInstance();

        Role role = new Role();
        role.add();
        role.showOptions();

        UserDecorator user = new UserDecorator(role);
        user.add();
        user.showOptions();

        ReviewerDecorator reviewer = new ReviewerDecorator(user);
        reviewer.add();
        reviewer.showOptions();

        ChairDecorator chair = new ChairDecorator(reviewer);
        chair.add();
        chair.showOptions();



    }

}
