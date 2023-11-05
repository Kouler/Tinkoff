package edu.hw4;

import java.util.Comparator;

public class AnimalWeightComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        Integer nullChecker = NullChecker.check(o1, o2);
        return nullChecker == null ? o1.weight() - o2.weight() : nullChecker;
    }
}
