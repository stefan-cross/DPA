package main.java.com.conference.composite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 11/07/2014
 * Time: 10:23
 */
public class DiscussionItemGroup<D> {

    private ArrayList<D> discussions = new ArrayList<D>();

    public void listComments() {
        for(D discussion: discussions){
            System.out.println(discussion.toString());
        }
    }

    public List<D> getDiscussions() { return discussions;}
}
