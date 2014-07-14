package main.java.com.conference.observer;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 14/07/2014
 * Time: 15:12
 */
public interface Subject {
    void attachObserver(Observer observer);
    void detachObserver(Observer observer);
    void change();
}
