package edu.hw1;

public final class Task3 {

    private Task3() {
    }

    public static boolean isNestable(int[] a1, int[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return false;
        }
        int minA1 = a1[0];
        int maxA1 = a1[0];
        int minA2 = a2[0];
        int maxA2 = a2[0];

        for (int el : a1) {
            if (minA1 > el) {
                minA1 = el;
            }
            if (maxA1 < el) {
                maxA1 = el;
            }
        }
        for (int el : a2) {
            if (minA2 > el) {
                minA2 = el;
            }
            if (maxA2 < el) {
                maxA2 = el;
            }
        }

        return minA1 > minA2 && maxA1 < maxA2;
    }
}
