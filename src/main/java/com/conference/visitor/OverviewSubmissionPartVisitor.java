package main.java.com.conference.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 18/07/2014
 * Time: 16:16
 */
public class OverviewSubmissionPartVisitor implements SubmissionPartVisitor {
    @Override
    public void visit(SubmissionPart submissionPart) {
        System.out.println("Summary details : " + submissionPart);
    }
}
