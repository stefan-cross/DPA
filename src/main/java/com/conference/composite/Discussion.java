package main.java.com.conference.composite;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 11/07/2014
 * Time: 10:25
 */
public interface Discussion {

    public String getComment();

    public void setComment() throws IOException;
}
