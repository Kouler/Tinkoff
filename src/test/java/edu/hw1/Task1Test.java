package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task1.minutesToSeconds;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("Task1: minutes to seconds")
    void check_minutesToSeconds() {
        String[] set = new String[] {
            "23:09",
            "13:58",
            "00:00",
            "698:00",
            "698:01",
            "698:59",
            "698:60",
            "60:698",
            "1:2:3",
            "12:3O" //это буква O, а не 0
        };
        long[] await = new long[] {
            1389, 838, 0, 41880, 41881, 41939, -1, -1, -1, -1
        };

        for (int i = 0; i < set.length; i++) {
            assertThat(minutesToSeconds(set[i]))
                .isEqualTo(await[i]);
        }
    }
}
