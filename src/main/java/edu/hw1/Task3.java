package edu.hw1;

public final class Task3 {
    public static boolean isNestable(int[] a1, int[] a2) {
        int min_a1 = a1[0],
            max_a1 = a1[0],
            min_a2 = a2[0],
            max_a2 = a2[0];

        for (int el : a1) {
            if (min_a1 > el) min_a1 = el;
            if (max_a1 < el) max_a1 = el;
        }
        for (int el : a2) {
            if (min_a2 > el) min_a2 = el;
            if (max_a2 < el) max_a2 = el;
        }

        return min_a1 > min_a2 && max_a1 < max_a2;
    }
}
