package main.java.com.conference.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 18/07/2014
 * Time: 16:04
 */
public class Client {

    public static void main(String[] args){

        Submission submission = new Submission();

        submission.getSubmissionPartList().add(new Abstract());
        submission.getSubmissionPartList().add(new Presentation());
        submission.getSubmissionPartList().add(new Review());
        submission.getSubmissionPartList().add(new Rebuttal());


        submission.agenda();
        System.out.println("-------------------------");
        submission.overview();
        System.out.println("-------------------------");
        submission.comprehensive();

    }

}
