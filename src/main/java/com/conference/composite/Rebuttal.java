package main.java.com.conference.composite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 11/07/2014
 * Time: 10:53
 */
public class Rebuttal implements Discussion {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String comment = null;
    

    public void comment() throws IOException {
        System.out.println("Please submit your rebuttal");
        comment = br.readLine();
    }

    @Override
    public String getComment() {
        return null;
    }

    @Override
    public void setComment() throws IOException {

    }
}
