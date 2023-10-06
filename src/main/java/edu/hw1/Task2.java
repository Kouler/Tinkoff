package edu.hw1;

public final class Task2 {
    public static int countDigits(long x) {
        int count = 0;
        do {
            count++;
            x /= 10;
        } while (x != 0);

        return count;
    }
}
