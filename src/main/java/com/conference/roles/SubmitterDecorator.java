package main.java.com.conference.roles;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 05/07/2014
 * Time: 14:34
 */
public class SubmitterDecorator extends RoleDecorator{
    public SubmitterDecorator(Role role) {
        super(role);
    }

    public void add() {
        System.out.println("Submitter role granted");
        role.add();
    }

    public void submitWork(){
        System.out.println("Submitter role granted");
    }
}
