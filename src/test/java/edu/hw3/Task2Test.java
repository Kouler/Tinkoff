package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;

import static edu.hw3.Task2.clusterize;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {
    static Arguments[] source() {
        return new Arguments[] {
            Arguments.of(
                "",
                List.of()
            ),
            Arguments.of(
                "()()()",
                List.of("()", "()", "()")
            ),
            Arguments.of(
                "((()))()(())",
                List.of("((()))", "()", "(())")
            ),
            Arguments.of(
                "((()))(())()()(()())",
                List.of("((()))", "(())", "()", "()", "(()())")
            ),
            Arguments.of(
                "()()()(",
                null
            ),
            Arguments.of(
                "))((",
                null
            ),
            Arguments.of(
                "()a()",
                null
            )
        };
    }

    @ParameterizedTest
    @DisplayName("Test the Brace Clusterizer")
    @MethodSource("source")
    void check_task2(String src, List<String> await) {
        assertEquals(clusterize(src), await);
    }
}
