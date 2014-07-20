package main.java.com.conference.builder;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 19/07/2014
 * Time: 13:29
 */
public class PublicEventBuilder implements EventBuilder {

    private PublicEvent event = new PublicEvent();

    @Override
    public void name(String name) {event.setName(name);}
    @Override
    public void location(String location) {event.setLocation(location);}
    @Override
    public Event getEvent() {return event;}
}
