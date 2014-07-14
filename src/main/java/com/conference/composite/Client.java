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

        System.out.println("Listing review:");
        group.getDiscussions().add(comment);
        group.getDiscussions().add(comment2);
        group.getDiscussions().add(comment3);
        group.getDiscussions().add(rebuttal);

        group.listComments();

        DiscussionIterator it = new DiscussionIterator((java.util.List<Discussion>) group);
        if (it.hasNext()){
            System.out.println(it.next());
        }


    }

}
