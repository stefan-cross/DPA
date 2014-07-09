package main.java.com.conference.roles;

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

    public void reviewSubmission () {
        System.out.println("Reviewer has given a submission review");
    }
}
