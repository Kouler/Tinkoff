package edu.hw4;

import java.util.Comparator;

public class AnimalNameLengthComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        Integer nullChecker = NullChecker.check(o1, o2);
        return nullChecker == null ? o1.name().length() - o2.name().length() : nullChecker;
    }
}
