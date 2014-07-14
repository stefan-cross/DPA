package main.java.com.conference.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 13/07/2014
 * Time: 12:37
 */
public class DiscussionIterator implements Iterator<Discussion> {

    private List<Discussion> list;
    private int cursor = 0;

    public DiscussionIterator(List<Discussion> l){
        this.list = l;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public Discussion next() {
        int i = cursor;
        if(i > list.size()) { throw new NoSuchElementException(); }
        cursor = i++;
        return list.get(i);
    }
}
