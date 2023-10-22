package edu.hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import edu.hw2.task1.*;

public class Task1Test {
    @Test
    @DisplayName("Math calculatin")
    void check_math() {

        assertThat((new Constant(7)).evaluate())
            .isEqualTo(7D);

        assertThat(
            (
                new Exponent(
                    new Addition(
                        new Multiplication(
                            new Constant(5),
                            new Constant(3)
                        ), new Negate(
                            new Constant(-3)
                        )
                    ), 3)
            ).evaluate()
        ).isEqualTo(5832D);

        assertThat(new Negate(new Constant(-6)))
            .isNotEqualTo(new Constant(6));
    }
}
