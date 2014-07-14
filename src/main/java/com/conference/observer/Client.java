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
        Review review = new Review();

        submission.attachObserver(review);
        submission.comment();
    }
}
