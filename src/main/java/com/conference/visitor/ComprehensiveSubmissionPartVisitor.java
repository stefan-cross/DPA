package main.java.com.conference.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 18/07/2014
 * Time: 16:00
 */
public class ComprehensiveSubmissionPartVisitor implements SubmissionPartVisitor {
    @Override
    public void visit(SubmissionPart submissionPart) {
        System.out.println("Full details : " + submissionPart);
    }
}
