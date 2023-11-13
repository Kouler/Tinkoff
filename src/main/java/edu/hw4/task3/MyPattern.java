package edu.hw4.task3;

import java.time.LocalDate;
import java.util.regex.Pattern;

public interface MyPattern {
    LocalDate getDate(String string);

    Pattern getPattern();
}
