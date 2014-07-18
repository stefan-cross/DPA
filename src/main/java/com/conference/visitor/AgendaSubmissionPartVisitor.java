package main.java.com.conference.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 18/07/2014
 * Time: 15:54
 */
public class AgendaSubmissionPartVisitor implements SubmissionPartVisitor {
    @Override
    public void visit(SubmissionPart submissionPart) {
        System.out.println("Agenda : " + submissionPart);
    }
}
