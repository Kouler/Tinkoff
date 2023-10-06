package edu.hw1;

public final class Task1 {

    public static long minutesToSeconds(String s) {
        String[] parsed_s = s.split(":");
        long min = Long.parseLong(parsed_s[0]);
        short sec = Short.parseShort(parsed_s[1]);

        //sec<=0 это я просто, ну мало-ли, ну вдруг дадут "13:-3"
        //а такая ошибка, теоретически, может возникнуть...
        if (sec >= 60 || sec < 0) return -1;
        else {
            return min*60 + sec;
        }
    }
}
