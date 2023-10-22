package edu.project1;

import org.jetbrains.annotations.NotNull;

public interface Dictionary {
    @NotNull
    String getRandomWord();

    String getRandomWord(int num);
}
