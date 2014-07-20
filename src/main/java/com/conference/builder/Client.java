package main.java.com.conference.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 19/07/2014
 * Time: 13:34
 */
public class Client {

    public static void main(String[] args) throws IOException {

        // instantiate the director
        EventBuildDirector director = new EventBuildDirector();
        String name="OOPSLA";
        String location = "Oxford, United Kingdom";

        // Start building public event
        EventBuilder builder = new PublicEventBuilder();
        Event event = director.buildEvent(name, location, builder);
        event.execute();

        // Start building public event
        EventBuilder _builder = new PrivateEventBuilder();
        Event _event = director.buildEvent(name, location, _builder);
        _event.execute();

    }
}
