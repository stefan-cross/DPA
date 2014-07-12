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
public class DiscussionItemGroup {

    private List<Discussion> discussions = new ArrayList<Discussion>();

    public void listComments() {
        for(Discussion discussion: discussions){
            discussion.getComment();
        }
    }



    public List<Discussion> getDiscussions() {
        return discussions;
    }
}
