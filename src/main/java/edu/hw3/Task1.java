package edu.hw3;

public class Task1 {
    private Task1() {
    }

    public static String atbash(String string) {

        StringBuilder newS = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            boolean isUpper = Character.isUpperCase(c);
            c = Character.toLowerCase(c);
            if (c >= 'a' && c <= 'z') {
                c = (char) ('z' - (c - 'a'));
            }
            if (isUpper) {
                c = Character.toUpperCase(c);
            }
            newS.append(c);
        }

        return newS.toString();
    }
}
