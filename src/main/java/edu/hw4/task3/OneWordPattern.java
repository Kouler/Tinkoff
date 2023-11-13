package edu.hw4.task3;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class OneWordPattern implements MyPattern {

    private final Pattern pattern = Pattern.compile("^([a-zA-z])$");

    @Override
    public LocalDate getDate(String string) {
        LocalDate date = LocalDate.now();
        return switch (string) {
            case "tomorrow" -> date.plusDays(1);
            case "yesterday" -> date.minusDays(1);
            case "today" -> date;
            default -> null;
        };
    }

    @Override
    public Pattern getPattern() {
        return pattern;
    }
}
