package main.java.com.conference.builder;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 19/07/2014
 * Time: 13:25
 */
public class PublicEvent implements Event {
    private String name;
    private String location;
    @Override
    public void execute() {System.out.println("Creating public event "+name+" at "+location);}
    public void setLocation(String location) {this.location = location;}
    public void setName(String name) {this.name = name;}
}
