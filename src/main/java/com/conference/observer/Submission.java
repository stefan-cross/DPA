package main.java.com.conference.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 14/07/2014
 * Time: 15:23
 */
public class Submission implements Subject {

    List<Observer> observers = new ArrayList<Observer>();

    public void comment(){
        change();
    }

    @Override
    public void attachObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void change() {
        for(Observer observer : observers){
            observer.update();
        }
    }
}
