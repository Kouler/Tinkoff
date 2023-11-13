package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static edu.hw4.Task1.sessionStatistics;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {

    static Arguments[] strings() {
        return new Arguments[] {
            Arguments.of(
                """
                    2022-03-12, 20:20 - 2022-03-12, 23:50
                    2022-04-01, 21:30 - 2022-04-02, 01:20
                    """,
                "3ч 40м"
            ),
            Arguments.of(
                """
                    """,
                ""
            ),
            Arguments.of(
                """
                    2020-01-12, 20:12 - 2021-10-13, 20:13
                    1230-21-2304:12
                    """,
                ""
            ),
            Arguments.of(
                """
                    2022-03-12, 20:20 - 2021-03-12, 23:50
                    """,
                ""
            )
        };
    }
    @ParameterizedTest
    @DisplayName("Test the average sessions time")
    @MethodSource("strings")
    void check_task1(String session, String answer) {
        assertThat(sessionStatistics(session))
            .isEqualTo(answer);
    }
}
