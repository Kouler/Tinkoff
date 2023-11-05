package edu.hw4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class AnimalTypes {

    private AnimalTypes() {
    }

    static public Map<Animal.Type, Integer> typeCount(List<Animal> list) {
        return list.stream()
            .collect(
                Collectors.groupingBy(
                    Animal::type, Collectors.summingInt(animal -> 1)
                )
            );
    }

    static public Animal.Sex mostGender(List<Animal> list) {
        if (list.isEmpty()) {
            return null;
        }
        int males = (int) list.stream()
            .filter(animal -> animal.sex().equals(Animal.Sex.M))
            .count();
        int females = (int) list.stream()
            .filter(animal -> animal.sex().equals(Animal.Sex.F))
            .count();

        if (males >= females) {
            return Animal.Sex.M;
        } else {
            return Animal.Sex.F;
        }
    }
}
