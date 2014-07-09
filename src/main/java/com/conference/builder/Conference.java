package main.java.com.conference.builder;

import java.util.Date;

public class Conference {

    private String name;
    private String url;
    private String chair;
    private String signupKey;
    private String signupNotice;
    private Preferences reviewerPermissions;
    private String confirmMsg;
    private String language;
    private Date date;

    // Container of the single instance
    private static final Conference INSTANCE = new Conference();

    // Lock down constructor
    Conference() {}

    // Access method to return the singleton instance
    public static Conference getInstance(){
        return INSTANCE;
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

    public Preferences getReviewerPermissions() {
        return reviewerPermissions;
    }

    public void setReviewerPermissions(Preferences reviewerPermissions) {
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
