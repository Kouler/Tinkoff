package edu.hw1;

public final class Task7 {

    private Task7() {

    }

    private static final int LEFTMOSTSHIFT = 62;

    private static long doWithMode(long x, long shift, boolean left) {
        long n = x;
        //если число ноль, то число ноль...
        if (n == 0) {
            return 0;
        }

        //форсируем цикличный сдвиг как с прямым кодом, а не обратным
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);

        //находим старший бит - он и будет левой границей, решил назвать его "указателем"
        long pointer = 1L << LEFTMOSTSHIFT;
        while (pointer > n) {
            pointer >>= 1;
        }

        //двигуем
        for (int i = 0; i < shift; i++) {
            if (left) { //влево
                int one = n / pointer == 0 ? 0 : 1;
                n <<= 1;
                n -= (pointer << 1) * one;
                n += one;
            } else { //вправо
                int one = (int) (n % 2);
                n >>= 1;
                n += pointer * one;
            }
        }
        return n * sign; //возвращаем знак
    }

    public static long rotateLeft(long n, long shift) {
        return doWithMode(n, shift, true);
    }

    public static long rotateRight(long n, long shift) {
        return doWithMode(n, shift, false);
    }
}
