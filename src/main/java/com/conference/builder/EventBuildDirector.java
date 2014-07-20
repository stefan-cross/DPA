package main.java.com.conference.builder;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 19/07/2014
 * Time: 13:21
 */
public class EventBuildDirector {
    public Event buildEvent(String name, String location, EventBuilder builder){
        builder.name(name);
        builder.location(location);
        return builder.getEvent();
    }
}
