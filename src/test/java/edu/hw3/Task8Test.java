package edu.hw3;

import java.util.ArrayList;
import edu.hw3.task8.BackwardIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task8Test {
    @Test
    @DisplayName("Test the BackwardIterator")
    void check_Task8() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);

        BackwardIterator<Integer> iterator = new BackwardIterator<>(array);

        assertThat(iterator.next())
            .isEqualTo(3);
        assertThat(iterator.next())
            .isEqualTo(2);
        assertThat(iterator.next())
            .isEqualTo(1);
        assertThat(iterator.hasNext())
            .isEqualTo(false);
    }
}
