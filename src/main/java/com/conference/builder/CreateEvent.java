package main.java.com.conference.builder;

import main.java.com.conference.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 08/07/2014
 * Time: 20:29
 */
public class CreateEvent {

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Conference BuildEvent() throws IOException {

        // Create our conference event
        Conference conference = new Conference();
        System.out.println("Please follow the conference creation steps.");
        System.out.println("-------------------- Conference Details  -------------------");
        System.out.println("Conference name:");
        conference.setName(br.readLine());
        System.out.println("URL:");
        conference.setUrl(br.readLine());
        System.out.println("Conference notice:");
        conference.setSignupNotice(br.readLine());
        System.out.println("Signup key:");
        conference.setSignupKey(br.readLine());


        // Create our conf Chair/Admin
        User user = User.getInstance();
        System.out.println("-------------------- Chair Details  -------------------");
        System.out.println("First Name:");
        user.setFirstname(br.readLine());
        System.out.println("Surname Name:");
        user.setSurname(br.readLine());
        System.out.println("Email:");
        user.setEmail(br.readLine());
        System.out.println("Date of Birth:");
        try {
            user.setDob(new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH).parse(br.readLine()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Set reviewer preferences
        Preferences pref = new Preferences();
        System.out.println("-------------------- Review Preferences  -------------------");
        System.out.println("Anonymous reviewing:");
        pref.setAnonymousReviewing(Boolean.valueOf(br.readLine()));
        System.out.println("Reviewers view all submissions:");
        pref.setReviewersToViewAllSubs(Boolean.valueOf(br.readLine()));

        // Create our conf Chair/Admin
        System.out.println("-------------------- Chair Details  -------------------");
        System.out.println("First Name:");
        user.setFirstname(br.readLine());
        System.out.println("Surname Name:");
        user.setSurname(br.readLine());


        System.out.println("Step up complete, the conference details are:");
        System.out.println(conference.getName());
        System.out.println(conference.getUrl());
        System.out.println(conference.getSignupNotice());
        System.out.println(conference.getLanguage());
        System.out.println("the chair detials are:");
        System.out.println(user.getFirstname());
        System.out.println(user.getSurname());
        System.out.println(user.getEmail());
        System.out.println(user.getDob());

        return conference;
    }
}
