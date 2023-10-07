package edu.hw1;

public final class Task4 {

    private Task4() {
    }

    public static String fixString(String s) {
        //про стринг-билдера не знал, IDEA сама предложила - я с радостью согласился)
        StringBuilder fixed = new StringBuilder();
        for (int i = 0; i < s.length() / 2; i++) {
            fixed.append(s.charAt(2 * i + 1));
            fixed.append(s.charAt(2 * i));
        }

        //последнего отщепенца тоже не забываем...
        if (s.length() % 2 != 0) {
            fixed.append(s.charAt(s.length() - 1));
        }

        return fixed.toString();
    }
}
