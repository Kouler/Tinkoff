package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static edu.hw3.Task1.atbash;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    static Arguments[] source() {
        return new Arguments[] {
            Arguments.of((Object) new String[] {"abc", "zyx"}),
            Arguments.of((Object) new String[] {"ZA", "AZ"}),
            Arguments.of((Object) new String[] {"abcdefgHIJKLMNOP", "zyxwvutSRQPONMLK"}),
            Arguments.of((Object) new String[] {"кьюарЭСТИюВИдаблЮ", "кьюарЭСТИюВИдаблЮ"}),
            Arguments.of((Object) new String[] {"Икс Y ЗЭЭЭЭТ /.,&&%^#@%@$!$#@%^&*0123(", "Икс B ЗЭЭЭЭТ /.,&&%^#@%@$!$#@%^&*0123("})
        };
    }

    @ParameterizedTest
    @DisplayName("Test the Atbash Cipher")
    @MethodSource("source")
    void check_task1(String[] src) {
        assertThat(atbash(src[0]))
            .isEqualTo(src[1]);
    }
}
