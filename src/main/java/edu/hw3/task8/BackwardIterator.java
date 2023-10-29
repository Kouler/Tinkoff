package edu.hw3.task8;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BackwardIterator<E> implements Iterator<E> {
    int cursor;       // index of next element to return
    int lastRet = -1; // index of last element returned; -1 if no such

    List<E> list;

    // prevent creating a synthetic constructor
    public BackwardIterator(List<E> list) {
        cursor = list.size() - 1;
        this.list = list;
    }

    public boolean hasNext() {
        return cursor != -1;
    }

    public E next() {
        int i = cursor;
        if (i < 0) {
            throw new NoSuchElementException();
        }
        cursor = i - 1;
        lastRet = i;
        return list.get(lastRet);

    }

    public void remove() {
        if (lastRet < 0) {
            throw new IllegalStateException();
        }
        try {
            list.remove(lastRet);
            cursor = lastRet;
            lastRet = -1;
        } catch (IndexOutOfBoundsException ex) {
            throw new ConcurrentModificationException();
        }
    }
}
