package main.java.com.conference.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 08/07/2014
 * Time: 18:42
 */
public class ReviewerDecorator extends RoleDecorator {

    public ReviewerDecorator(Role role) {
        super(role);
    }

    public void add() {
        System.out.println("Reviewer role granted.");
        role.add();
    }

    public void showOptions () {
        System.out.println("Reviewer menu options (Level 2)");
    }
}
