package edu.hw1;

public final class Task5 {
    private static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i -1)) return false;
        }
        return true;
    }

    private static String find_next(String s) {
        //Вводим правило - нечётная длина не может породить потомка
        if (s.length() % 2 == 1) return "";

        StringBuilder new_s = new StringBuilder();
        for (int i = 0; i < s.length() / 2; i++) {
            new_s.append(
                Character.getNumericValue(s.charAt(2 * i)) +
                Character.getNumericValue(s.charAt(2 * i + 1))
            );
        }
        return new_s.toString();
    }

    public static boolean isPalindromeDescendant(long x) {
        if (x < 10) return false;

        String s = Long.toString(x);
        if (check(s)) return true;
        else {
            s = find_next(s);
            boolean at_least_one = false;
            while (s.length() >= 2) {
                if (check(s)) {
                    at_least_one = true;
                    break;
                }
                s = find_next(s);
            }
            return at_least_one;
        }
    }
}
