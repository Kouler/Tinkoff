package edu.hw3.task5;

import java.util.Comparator;

public class SortByDESC implements Comparator<SortingPrinciple> {
    @Override
    public int compare(SortingPrinciple o1, SortingPrinciple o2) {
        return o2.sortingElement().compareTo(o1.sortingElement());
    }
}
