package edu.hw1;

public final class Task1 {

    private static final int SECONDS = 60;
    private static final int LENGTH = 2;

    private Task1() {
    }

    private static boolean check(String[] s) {
        if (s.length != LENGTH) {
            return false;
        }
        //знаю про .matches(), решил в лоб написать
        //в случае, если символ не попадает в интервал от '0' до '9', выкидываем с -1
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                if ('0' > s[i].charAt(j) || s[i].charAt(j) > '9') {
                    return false;
                }
            }
        }
        return true;
    }

    public static long minutesToSeconds(String s) {
        String[] parsedS = s.split(":");
        if (!check(parsedS)) {
            return -1;
        }

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
