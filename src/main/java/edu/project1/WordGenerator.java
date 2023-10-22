package edu.project1;

import org.jetbrains.annotations.NotNull;

public final class WordGenerator implements Dictionary {
    static final String[] WORDS = {"hangman", "JohnWick", "cup"};
    public static int counter = -1;

    @Override
    @NotNull
    public String getRandomWord() {
        counter = ++counter % WORDS.length;
        return WORDS[counter];
    }

    @Override
    public String getRandomWord(int num) {
        if (num >= 0 && num < WORDS.length) {
            return WORDS[num];
        } else {
            return getRandomWord();
        }
    }
}
