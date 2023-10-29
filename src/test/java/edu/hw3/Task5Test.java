package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import static edu.hw3.task5.Task5.parseContacts;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5Test {
    static Arguments[] source() {
        return new Arguments[] {
            Arguments.of(
                List.of(
                    "John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes", "Antonio"
                ),
                "ASC",
                List.of("Antonio", "Thomas Aquinas", "Rene Descartes", "David Hume", "John Locke")
            ),
            Arguments.of(
                List.of(
                    "Paul Erdos", "Leonhard Euler", "Ricardo", "Carl Gauss"
                ),
                "DESC",
                List.of("Ricardo", "Carl Gauss", "Leonhard Euler", "Paul Erdos")
            ),
            Arguments.of(
                List.of(),
                "DESC",
                List.of()
            ),
            Arguments.of(
                null,
                "DESC",
                List.of()
            )
        };
    }

    @ParameterizedTest
    @DisplayName("Test the Contacts Sorting")
    @MethodSource("source")
    void check_task5(List<String> src, String param, List<String> await) {
        assertEquals(await, parseContacts(src, param));
    }
}
