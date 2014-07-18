package main.java.com.conference.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 05/07/2014
 * Time: 14:34
 */
public class UserDecorator extends RoleDecorator{

    public UserDecorator(Role role) {
        super(role);
    }

    public void add() {
        System.out.println("User role granted");
        role.add();
    }

    public void showOptions(){
        System.out.println("User menu options (Level4)");
    }
}
