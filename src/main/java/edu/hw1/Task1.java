package edu.hw1;

public final class Task1 {

    private static final int SECONDS = 60;

    private Task1() {
    }

    public static long minutesToSeconds(String s) {
        String[] parsedS = s.split(":");
        long min = Long.parseLong(parsedS[0]);
        short sec = Short.parseShort(parsedS[1]);

        //sec<=0 это я просто, ну мало-ли, ну вдруг дадут "13:-3"
        //а такая ошибка, теоретически, может возникнуть...
        if (sec >= SECONDS || sec < 0) {
            return -1;
        } else {
            return min * SECONDS + sec;
        }
    }
}
