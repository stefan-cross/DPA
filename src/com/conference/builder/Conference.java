package com.conference.builder;

import com.conference.permissions.Config;
import com.conference.roles.ChairDecorator;

import java.util.Date;

public class Conference {

    String name;
    String url;
    String chair;
    String signupKey;
    String signupNotice;
    Config reviewerPermissions;
    String confirmMsg;
    String language;
    Date date;


    // Container of the single instance
    private static Conference instance = null;

    // Lock down constructor
    Conference() {}

    // Create single thread safe instance
    private synchronized static void createInstance () {
        if(instance == null) instance = new Conference();
    }

    // Access method to return the singleton instance
    public static Conference getInstance(){
        if (instance == null) createInstance();
        return instance;
    }

    public void notifyOfCreation(){
        System.out.println("Conference singleton object created:");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getSignupKey() {
        return signupKey;
    }

    public void setSignupKey(String signupKey) {
        this.signupKey = signupKey;
    }

    public String getSignupNotice() {
        return signupNotice;
    }

    public void setSignupNotice(String signupNotice) {
        this.signupNotice = signupNotice;
    }

    public Config getReviewerPermissions() {
        return reviewerPermissions;
    }

    public void setReviewerPermissions(Config reviewerPermissions) {
        this.reviewerPermissions = reviewerPermissions;
    }

    public String getConfirmMsg() {
        return confirmMsg;
    }

    public void setConfirmMsg(String confirmMsg) {
        this.confirmMsg = confirmMsg;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
