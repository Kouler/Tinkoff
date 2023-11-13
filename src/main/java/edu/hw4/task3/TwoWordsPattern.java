package edu.hw4.task3;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class TwoWordsPattern implements MyPattern {

    private final Pattern pattern = Pattern.compile("^[a-zA-z] [a-zA-z]$");

    @Override
    public LocalDate getDate(String string) {
        LocalDate date = LocalDate.now();
        return switch (string) {
            case "after tomorrow" -> date.plusDays(2);
            case "before yesterday" -> date.minusDays(2);
            default -> null;
        };
    }

    @Override
    public Pattern getPattern() {
        return pattern;
    }
}
