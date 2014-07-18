package main.java.com.conference.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 05/07/2014
 * Time: 21:30
 */
public class RoleDecorator extends Role{

    protected Role role;
    protected Role options;

    public RoleDecorator(Role role) {this.role = role;}

    public void add() { role.add(); }

    public void showOptions(){
        options.showOptions();
    }
}
