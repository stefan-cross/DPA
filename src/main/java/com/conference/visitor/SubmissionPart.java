package main.java.com.conference.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 18/07/2014
 * Time: 15:36
 */
public abstract class SubmissionPart {
    void acceptSubmissionVisitor(SubmissionPartVisitor visitor) {
        visitor.visit(this);
    }
}
