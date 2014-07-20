package main.java.com.conference.builder;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 19/07/2014
 * Time: 13:33
 */
public class PrivateEventBuilder implements EventBuilder {
    private PrivateEvent event = new PrivateEvent();

    @Override
    public void name(String name) {event.setName(name);}
    @Override
    public void location(String location) {event.setLocation(location);}
    @Override
    public Event getEvent() {return event;}
}
