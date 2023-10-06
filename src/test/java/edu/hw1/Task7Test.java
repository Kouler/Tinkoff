package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task7.rotateLeft;
import static edu.hw1.Task7.rotateRight;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task7Test {
    @Test
    @DisplayName("Task7: binary rotate left")
    void check_rotateLeft() {
        long[][] set = {
            {8, 1},
            {16, 1},
            {17, 2},
            {0, 5},
            {1, 12},
            {2, 3},
            {8, 0},
            {9223372036854775807L, 4},
            {-9, 2}
        };

        long[]await = {1, 1, 6, 0, 1, 1, 8, 9223372036854775807L, -6};

        for (int i = 0; i < set.length; i++) {
            assertThat(rotateLeft(set[i][0], set[i][1]))
                .isEqualTo(await[i]);
        }
    }
    @Test
    @DisplayName("Task7: binary rotate right")
    void check_rotateRight() {
        long[][] set = {
            {8, 1},
            {16, 1},
            {17, 2},
            {0, 5},
            {1, 12},
            {2, 3},
            {8, 0},
            {9223372036854775807L, 4},
            {-9, 2}
        };

        long[]await = {4, 8, 12, 0, 1, 1, 8, 9223372036854775807L, -6}; //-1610612739

        for (int i = 0; i < set.length; i++) {
            assertThat(rotateRight(set[i][0], set[i][1]))
                .isEqualTo(await[i]);
        }
    }
}
