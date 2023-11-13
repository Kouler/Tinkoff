package edu.hw4.task3;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class MyDateParser {
    private MyDateParser() {
    }

    private static final List<MyPattern> MATCHES = List.of(
        new NumericPattern(),
        new OneWordPattern(),
        new TwoWordsPattern(),
        new NumAndWordsPattern()
    );


    public static Optional<LocalDate> parseDate(String string) {
        Optional<MyPattern> func = MATCHES
            .stream()
            .filter(eachElement -> eachElement.getPattern().matcher(string).find())
            .findFirst();

        return func.map(myPattern -> myPattern.getDate(string));
    }
}
