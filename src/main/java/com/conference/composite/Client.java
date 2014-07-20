package main.java.com.conference.composite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 12/07/2014
 * Time: 21:22
 */
public class Client {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Enter comment:");
        Comment comment = new Comment();
        comment.setComment(br.readLine());
        System.out.println("Enter comment:");
        Comment comment2 = new Comment();
        comment2.setComment(br.readLine());
        System.out.println("Enter comment:");
        Comment comment3 = new Comment();
        comment3.setComment(br.readLine());
        System.out.println("Enter rebuttal:");
        Rebuttal rebuttal = new Rebuttal();
        rebuttal.setComment(br.readLine());

        DiscussionItemGroup group = new DiscussionItemGroup();
        DiscussionItemGroup group2 = new DiscussionItemGroup();

        group.getDiscussions().add(comment);
        group.getDiscussions().add(comment2);
        group.getDiscussions().add(comment3);
        // new group2 used
        group2.getDiscussions().add(rebuttal);
        // nesting groups in groups
        group.getDiscussions().add(group2);
        // list out all comments
        group.listComments();

//        DiscussionIterator it = new DiscussionIterator((java.util.List<Discussion>) group);
//        if (it.hasNext()){
//            System.out.println(it.next());
//        }


    }

}
