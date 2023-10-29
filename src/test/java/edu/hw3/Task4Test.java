package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static edu.hw3.Task4.convertToRoman;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {
    static Arguments[] source() {
        return new Arguments[] {
            Arguments.of(
                2,
                "II"
            ),
            Arguments.of(
                12,
                "XII"
            ),
            Arguments.of(
                16,
                "XVI"
            ),
            Arguments.of(
                3768,
                "MMMDCCLXVIII"
            ),
            Arguments.of(
                0,
                null
            ),
            Arguments.of(
                4000,
                null
            )
        };
    }

    @ParameterizedTest
    @DisplayName("Test the Converter to Roman Digits")
    @MethodSource("source")
    void check_task4(int src, String await) {
        assertEquals(convertToRoman(src), await);
    }
}
