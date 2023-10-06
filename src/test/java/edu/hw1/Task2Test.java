package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task2.countDigits;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class Task2Test {
    @Test
    @DisplayName("Task2: count the digits")
    void check_digitsCount() {

        long[] set = {
            0, 1, 10, 19, 123456789, -13, -0
        };

        int[] await = {
            1, 1, 2, 2, 9, 2, 1
        };

        for (int i = 0; i < set.length; i++) {
            assertThat(countDigits(set[i]))
                .isEqualTo(await[i]);
        }
    }
}
