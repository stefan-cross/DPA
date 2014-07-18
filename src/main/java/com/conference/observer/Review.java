package main.java.com.conference.observer;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 14/07/2014
 * Time: 15:29
 */
public class Review implements Observer {
    public void comment(String comment){System.out.println("Comment added:" + comment);}

    @Override
    public void update() { this.comment("This is an example update.");}
}
