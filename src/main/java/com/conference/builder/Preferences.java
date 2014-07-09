package main.java.com.conference.builder;


/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 08/07/2014
 * Time: 20:19
 */
public class Preferences {

    private Boolean anonymousReviewing;
    private Boolean reviewersToViewAllSubs;

    public static Preferences instance = null;

    Preferences(){}

    private synchronized static void createInstance() {
        if(instance == null) instance = new Preferences();
    }


    public static Preferences getInstance() {
        if(instance == null) createInstance();
        return instance;
    }

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
