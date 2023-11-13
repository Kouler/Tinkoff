package edu.hw4.task3;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumAndWordsPattern implements MyPattern {
    private final Pattern pattern = Pattern.compile("^(\\d+) [a-zA-z] ([a-zA-z])$");

    @Override
    public LocalDate getDate(String string) {
        Matcher matcher = pattern.matcher(string);
        LocalDate date = LocalDate.now();

        return switch (matcher.group(2)) {
            case "ahead" -> date.plusDays(Integer.parseInt(matcher.group(1)));
            case "ago" -> date.minusDays(Integer.parseInt(matcher.group(1)));
            default -> null;
        };
    }

    @Override
    public Pattern getPattern() {
        return pattern;
    }
}
