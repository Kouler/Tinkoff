package edu.hw2;

import edu.hm2.task4.CallingInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hm2.task4.Info.callingInfo;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {
    @Test
    @DisplayName("Check the Throwable#getClassName() method")
    void check_it_already() {
        CallingInfo info = null;
        try {
            int x = 4 / 0;
        }
        catch (Exception e) {
            info = callingInfo(e);
        }

        //className=edu.hw2.Task4Test
        //methodName=check_it_already
        assertThat(new CallingInfo(
            "edu.hw2.Task4Test",
            "check_it_already")
        ).isEqualTo(info);
    }
}
