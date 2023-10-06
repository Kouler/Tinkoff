package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task6.countK;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task6Test {
    @Test
    @DisplayName("Task6: check Kaprikar constant")
    void check_countK() {
        int[] set = {
            3524,
            6621,
            6554,
            1234,
            9999,
            6174,
            1000
        };

        int[] await = {3, 5, 4, 3, -2, 0, -1};

        for (int i = 0; i < set.length; i++)
            assertThat(countK(set[i]))
                .isEqualTo(await[i]);
    }
}
