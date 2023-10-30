package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task4.fixString;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {
    @Test
    @DisplayName("Task4: fixing the string")
    void check_fixingString() {
        String[] set = {
            "123456",
            "hTsii  s aimex dpus rtni.g",
            "badce",
            "укукбмре ,тэ огоруце",
            "",
            "1"
        };

        String[] await = {
            "214365",
            "This is a mixed up string.",
            "abcde",
            "кукумбер, это огурец",
            "",
            "1"
        };

        for (int i = 0; i < set.length; i++) {
            assertThat(fixString(set[i]))
                .isEqualTo(await[i]);
        }
    }
}
