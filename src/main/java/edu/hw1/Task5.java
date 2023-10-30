package edu.hw1;

public final class Task5 {

    private Task5() {
    }

    private static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static String findNext(String s) {
        //Вводим правило - нечётная длина не может породить потомка
        if (s.length() % 2 == 1) {
            return "";
        }

        StringBuilder newS = new StringBuilder();
        for (int i = 0; i < s.length() / 2; i++) {
            newS.append(
                Character.getNumericValue(s.charAt(2 * i))
                    + Character.getNumericValue(s.charAt(2 * i + 1))
            );
        }
        return newS.toString();
    }

    private static final int TEN = 10;

    public static boolean isPalindromeDescendant(long x) {
        if (x < TEN) {
            return false;
        }

        String s = Long.toString(x);
        if (check(s)) {
            return true;
        } else {
            s = findNext(s);
            boolean atLeastOne = false;
            while (s.length() >= 2) {
                if (check(s)) {
                    atLeastOne = true;
                    break;
                }
                s = findNext(s);
            }
            return atLeastOne;
        }
    }
}
