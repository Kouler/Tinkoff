package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task3.isNestable;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class Task3Test {
    @Test
    @DisplayName("Task3: is nestable")
    void check_isNestable() {
        int[][][] set = {
            {{1, 2, 3, 4, 5, 6, 7, 8}, {0, 9}},
            {{1, 2, 3}, {2, 3, 4}},
            {{9, 9, 8}, {8, 9}},
            {{3, 1}, {4, 0}},
            {{0}, {0}},
        };

        boolean[] await = {
            true, false, false, true, false
        };

        for (int i = 0; i < set.length; i++) {
            assertThat(isNestable(set[i][0], set[i][1]))
                .isEqualTo(await[i]);
        }
    }
}
