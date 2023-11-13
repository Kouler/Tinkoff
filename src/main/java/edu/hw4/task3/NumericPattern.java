package edu.hw4.task3;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("MagicNumber")
public class NumericPattern implements MyPattern {

    private final Pattern pattern = Pattern.compile("^(\\d{4}|\\d{2})-|/|.|_(\\d{1,2})-|/|.|_(\\d{1,2})$");

    @Override
    public LocalDate getDate(String string) {
        Matcher matcher = pattern.matcher(string);
        int year = Integer.parseInt(matcher.group(1));
        if (year < 100) {
            year += 2000;
        }
        LocalDate date = LocalDate.of(
            year,
            Integer.parseInt(matcher.group(2)),
            Integer.parseInt(matcher.group(3)));

        return date;
    }

    @Override
    public Pattern getPattern() {
        return pattern;
    }
}
