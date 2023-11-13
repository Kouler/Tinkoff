package edu.hw4.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class FindNextBadFriday implements TemporalAdjuster {
    private static final int THIRTEEN = 13;

    @Override
    public Temporal adjustInto(Temporal temporal) {
        LocalDate startPoint = LocalDate.from(temporal);
        if (startPoint.getDayOfMonth() < THIRTEEN) {
            startPoint = startPoint.minusMonths(1);
        }
        startPoint = startPoint.withDayOfMonth(THIRTEEN);
        do {
            startPoint = startPoint.plusMonths(1);
        } while (startPoint.getDayOfWeek() != DayOfWeek.FRIDAY);

        return startPoint;
    }
}
