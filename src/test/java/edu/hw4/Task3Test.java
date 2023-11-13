package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.time.LocalDate;
import static edu.hw4.task3.MyDateParser.parseDate;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {

    static Arguments[] dates() {
        return new Arguments[] {
            Arguments.of(
                "2020-10-10",
                LocalDate.of(2020, 10, 10)
            ),
            Arguments.of(
                "20-2-2",
                LocalDate.of(2020, 2, 2)
            ),
            Arguments.of(
                "1976_3/1",
                LocalDate.of(1976, 3, 1)
            ),
            Arguments.of(
                "tomorrow",
                LocalDate.now().plusDays(1)
            ),
            Arguments.of(
                "today",
                LocalDate.now()
            ),
            Arguments.of(
                "before yesterday",
                LocalDate.now().minusDays(2)
            ),
            Arguments.of(
                "45 days ago",
                LocalDate.now().minusDays(45)
            ),
            Arguments.of(
                "11 days ahead",
                LocalDate.now().plusDays(11)
            )
        };
    }

    @ParameterizedTest
    @DisplayName("Check the multiple parser")
    @MethodSource("dates")
    void check_task3(String string, LocalDate date) {
        assertThat(parseDate(string))
            .isEqualTo(date);
    }
}
