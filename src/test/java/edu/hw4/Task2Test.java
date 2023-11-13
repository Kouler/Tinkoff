package edu.hw4;

import edu.hw4.task2.FindNextBadFriday;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.time.LocalDate;
import java.util.List;
import static edu.hw4.task2.CustomDateFunctions.fridayTheThirteen;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {

    static Arguments[] fridays() {
        return new Arguments[] {
            Arguments.of(
                1925,
                List.of(
                    "1925-02-13", "1925-03-13", "1925-11-13"
                )
            ),
            Arguments.of(
                2024,
                List.of(
                    "2024-09-13", "2024-12-13"
                )
            ),
            Arguments.of(
                -1,
                List.of()
            )
        };
    }

    @ParameterizedTest
    @DisplayName("Check the Friday's Magic")
    @MethodSource("fridays")
    void check_allFridays(int year, List<String> answer) {
        assertThat(fridayTheThirteen(year))
            .isEqualTo(answer);
    }

    static Arguments[] fridays2() {
        return new Arguments[] {
            Arguments.of(
                LocalDate.of(2024, 8, 13),
                LocalDate.of(2024, 9, 13)
            ),
            Arguments.of(
                LocalDate.of(2024, 9, 12),
                LocalDate.of(2024, 9, 13)
            ),
            Arguments.of(
                LocalDate.of(2023, 12, 31),
                LocalDate.of(2024, 9, 13)
            )
        };
    }

    @ParameterizedTest
    @DisplayName("Show me the next Friday the 13th")
    @MethodSource("fridays2")
    void chech_nextFriday(LocalDate date, LocalDate nextFriday) {
        assertThat(date.with(new FindNextBadFriday()))
            .isEqualTo(nextFriday);
    }
}
