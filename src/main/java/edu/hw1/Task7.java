package edu.hw1;

public final class Task7 {
    private static long doWithMode(long n, long shift, boolean left) {
        //если число ноль, то число ноль...
        if (n == 0) return 0;

        //форсируем цикличный сдвиг как с прямым кодом, а не обратным
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);

        //находим старший бит - он и будет левой границей, решил назвать его "указателем"
        long pointer = 1L << 62;
        boolean not_maximum = false;
        while (pointer > n) {
            pointer >>= 1;
            not_maximum = true;
        }

        //двигуем
        for (int i = 0; i < shift; i++)
            if (left) {//влево
                int one = n / pointer == 0 ? 0 : 1;
                n <<= 1;
                n -= (pointer << 1) * one;
                n += one;
            }
            else {//вправо
                int one = (int) (n % 2);
                n >>= 1;
                n+= pointer * one;
            }
        return n*sign; //возвращаем знак
    }

    public static long rotateLeft(long n, long shift) {
        return doWithMode(n, shift, true);
    }
    public static long rotateRight(long n, long shift) {
        return doWithMode(n, shift, false);
    }
}
