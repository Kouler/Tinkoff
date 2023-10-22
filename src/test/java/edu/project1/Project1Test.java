package edu.project1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Project1Test {
    @Test
    @DisplayName("The HangMan test")
    void filterEvenNumbers() {
        ConsoleHangman game = new ConsoleHangman();
        game.run(0);
    }
}
