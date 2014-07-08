package com.conference.permissions;


/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 08/07/2014
 * Time: 20:19
 */
public class Config {

    Boolean anonymousReviewing;
    Boolean reviewersToViewAllSubs;

    public Boolean getReviewersToViewAllSubs() {
        return reviewersToViewAllSubs;
    }

    public void setReviewersToViewAllSubs(Boolean reviewersToViewAllSubs) {
        this.reviewersToViewAllSubs = reviewersToViewAllSubs;
    }

    public Boolean getAnonymousReviewing() {
        return anonymousReviewing;
    }

    public void setAnonymousReviewing(Boolean anonymousReviewing) {
        this.anonymousReviewing = anonymousReviewing;
    }

}
