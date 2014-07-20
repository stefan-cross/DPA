package main.java.com.conference.builder;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 19/07/2014
 * Time: 13:23
 */
public interface EventBuilder {
    void name(String name);
    void location(String location);
    Event getEvent();
}
