package edu.hw3.task5;

import java.util.Comparator;

public class SortByASC implements Comparator<SortingPrinciple> {

    @Override
    public int compare(SortingPrinciple o1, SortingPrinciple o2) {
        return o1.sortingElement().compareTo(o2.sortingElement());
    }
}
