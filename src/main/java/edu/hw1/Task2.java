package edu.hw1;

public final class Task2 {

    private static final int TEN = 10;

    private Task2() {
    }

    public static int countDigits(long n) {
        long x = n;
        int count = 0;
        do {
            count++;
            x /= TEN;
        } while (x != 0);

        return count;
    }
}
