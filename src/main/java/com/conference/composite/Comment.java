package main.java.com.conference.composite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 11/07/2014
 * Time: 10:35
 */
public class Comment implements Discussion {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String comment = null;

    @Override
    public String getComment() {
        return comment;
    }

    @Override
    public void setComment() throws IOException {
        System.out.println("Please submit your comment");
        comment = br.readLine();
    }
}
