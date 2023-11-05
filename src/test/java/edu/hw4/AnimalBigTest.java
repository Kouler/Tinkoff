package edu.hw4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AnimalBigTest {
    List<Animal> list;
    final Animal animal1 = new Animal(
        "Kuzia", Animal.Type.CAT, Animal.Sex.M, 12, 30, 7, true
    );
    final Animal animal2 = new Animal(
        "Puzo", Animal.Type.BIRD, Animal.Sex.F, 2, 14, 1, false
    );
    final Animal animal3 = new Animal(
        "PiranhaTheMonster", Animal.Type.FISH, Animal.Sex.F, 1, 20, 4, true
    );
    final Animal animal4 = new Animal(
        "StyrofoamEater", Animal.Type.DOG, Animal.Sex.M, 7, 65, 20, true
    );
    final Animal animal5 = new Animal(
        "Jacob", Animal.Type.SPIDER, Animal.Sex.M, 1, 3, 0, false
    );

    @BeforeEach
    void setTheList() {
        list = new ArrayList<Animal>(
            List.of(
                animal1, animal2, animal3, animal4, animal5
            )
        );
    }

    @Test
    @DisplayName("Test height sorting")
    void task1() {
        list.sort(new AnimalHeightComparator());
        assertThat(list)
            .isEqualTo(List.of(
                animal5, animal2, animal3, animal1, animal4
            ));

    }

    @Test
    @DisplayName("Test weight sorting")
    void task2() {
        list.sort(new AnimalWeightComparator().reversed());
        list = list.stream().limit(2).toList();
        assertThat(list)
            .isEqualTo(List.of(
                animal4, animal1
            ));
    }

    @Test
    @DisplayName("Test Types Counting")
    void task3() {
        Map<Animal.Type, Integer> map_check = new HashMap<>();
        map_check.put(Animal.Type.CAT, 1);
        map_check.put(Animal.Type.DOG, 1);
        map_check.put(Animal.Type.BIRD, 1);
        map_check.put(Animal.Type.FISH, 1);
        map_check.put(Animal.Type.SPIDER, 1);

        assertThat(AnimalTypes.typeCount(list))
            .isEqualTo(map_check);
    }

    @Test
    @DisplayName("Test the Longest Name")
    void task4() {
        assertThat(Collections.max(list, new AnimalNameLengthComparator()))
            .isEqualTo(animal3);
    }

    @Test
    @DisplayName("Test Most Gender")
    void task5() {
        assertThat(AnimalTypes.mostGender(list))
            .isEqualTo(Animal.Sex.M);
    }
}
