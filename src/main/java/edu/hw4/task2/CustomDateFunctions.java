package edu.hw4.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CustomDateFunctions {
    private CustomDateFunctions() {
    }

    private static final int MONTHS = 12;
    private static final int THIRTEEN = 13;

    public static List<String> fridayTheThirteen(int year) {
        List<String> datesList = new ArrayList<>();
        if (year < 0) {
            return datesList;
        }

        for (int i = 1; i <= MONTHS; i++) {
            LocalDate date = LocalDate.of(year, i, THIRTEEN);
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                datesList.add(date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            }
        }

        return datesList;
    }
}
