package edu.hw3;

import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static edu.hw3.Task3.freqDict;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {
    static Arguments[] source() {
        return new Arguments[] {
            Arguments.of(
                List.of("a", "bb", "a", "bb"),
                new HashMap<String, Integer>() {{
                    put("a", 2);
                    put("bb", 2);
                }}
            ),
            Arguments.of(
                List.of("this", "and", "that", "and"),
                new HashMap<String, Integer>() {{
                    put("that", 1);
                    put("and", 2);
                    put("this", 1);
                }}
            ),
            Arguments.of(
                List.of("код", "код", "код", "bug"),
                new HashMap<String, Integer>() {{
                    put("код", 3);
                    put("bug", 1);
                }}
            ),
            Arguments.of(
                List.of(1, 1, 2, 2),
                new HashMap<Integer, Integer>() {{
                    put(1, 2);
                    put(2, 2);
                }}
            ),
            Arguments.of(
                List.of(true, false, false, false, false),
                new HashMap<Boolean, Integer>() {{
                    put(true, 1);
                    put(false, 4);
                }}
            ),
            Arguments.of(
                List.of(),
                new HashMap<>()
            )
        };
    }

    @ParameterizedTest
    @DisplayName("Test the Frequency Dictionary")
    @MethodSource("source")
    void check_task3(List<Object> src, HashMap<Object, Integer> await) {
        assertEquals(freqDict(src), await);
    }
}
