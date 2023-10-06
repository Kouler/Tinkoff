package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task5.isPalindromeDescendant;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task5Test {
    @Test
    @DisplayName("Task5: is Palindrome Descendant")
    void check_isPalindromeDescendant() {
        long[] set = {
            11211230,
            13001120,
            23336014,
            11,
            123312,
            0,
            13,
            456,
            -256,
            135323
        };

        boolean[] await = {
            true, true, true, true, true,
            false, false, false, false, false
        };

        for (int i = 0; i < set.length; i++) {
            assertThat(isPalindromeDescendant(set[i]))
                .isEqualTo(await[i]);
        }
    }
}
