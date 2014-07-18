package main.java.com.conference.observer;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 14/07/2014
 * Time: 15:35
 */
public class Client {

    public static void main(String[] args){

        Submission submission = new Submission();

        Review reviewer1 = new Review();
        Review reviewer2 = new Review();
        Review reviewer3 = new Review();

        submission.attachObserver(reviewer1);
        submission.attachObserver(reviewer2);
        submission.attachObserver(reviewer3);

        submission.change();
    }
}
