package edu.hw4;

import java.time.Duration;
import java.time.Instant;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("MagicNumber") // на цифры в группах регулярки жалуется
public class Task1 {

    private Task1() {
    }

    static final int S_IN_MINUTE = 60;
    static final int S_IN_HOURS = 3600;
    static final String STRING_END_FORMAT = ":00.00Z";

    public static String sessionStatistics(String sessions) {
        int counter = 0;
        double sum = 0;
        Pattern pattern = Pattern.compile(
            "^(\\d{4}-\\d{2}-\\d{2}), (\\d{2}:\\d{2}) - (\\d{4}-\\d{2}-\\d{2}), (\\d{2}:\\d{2})$"
        );
        for (String session : sessions.lines().toList()) {
            Matcher matcher = pattern.matcher(session);
            if (!matcher.find()) {
                return "";
            }

            Instant firstTime = Instant.parse(
                matcher.group(1) + "T" + matcher.group(2) + STRING_END_FORMAT
            );
            Instant secondTime = Instant.parse(
                matcher.group(3) + "T" + matcher.group(4) + STRING_END_FORMAT
            );

            Duration duration = Duration.between(firstTime, secondTime);
            if (duration.getSeconds() <= 0) {
                return "";
            }

            sum += duration.getSeconds();
            counter++;
        }

        if (counter == 0) {
            return "";
        }
        int result = (int) sum / counter;


        int hours = result / S_IN_HOURS;
        int minutes = (result - hours * S_IN_HOURS) / S_IN_MINUTE;
        return hours + "ч " + minutes + "м";
    }
}
