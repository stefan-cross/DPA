package main.java.com.conference.decorator;

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
        System.out.println("Chair role granted.");
        role.add();
    }

    public void showOptions(){
        System.out.println("Chair menu options (Level1)");
    }
}
