package edu.hw1;

public final class Task6 {

    private Task6() {
    }

    private static final int MIN = 1000;
    private static final int MAX = 9999;
    private static final int KAPREKAR = 6174;
    private static final int TEN = 10;
    private static final int KAPLENGTH = 4;
    private static final int ERROR1 = -1;
    private static final int ERROR2 = -2;
    private static final int THOUSAND = 1000;

    public static int countK(int n) {
        int x = n;
        if (x <= MIN || x > MAX) {
            return ERROR1;
        }
        int count = 0;

        // Диапазон значений для нашего числа как массива не большой - всего 10 значений,
        // а => будем сортировать подсчётом за O(n)
        while (x != KAPREKAR) {
            //массив подсчёта
            int[] countArr = new int[TEN];
            for (int i = 0; i < KAPLENGTH; i++) {
                //считаем по цифре
                int idx = x % TEN;
                countArr[idx]++;
                x /= TEN;
                // и сразу, если вдруг кол-во цифр будет равно 4, то число содержит
                // только одинаковые цифры => дадим код ошибки для этого случая -2 уже, а не -1
                if (countArr[idx] >= KAPLENGTH) {
                    return ERROR2;
                }
            count++;
            }

            int max = 0;
            int min = 0;
            int multiplier = THOUSAND;
            //"сортируем" "реверсивно" относительно множителя multiplier
            for (int i = 0; i < TEN; i++) {
                while (countArr[i] > 0) {
                    //находим минимальную и одновременно максимальную комбинацию из цифр исх. числа
                    min += i * multiplier; //i выступает в качестве самой цифры
                    max += i * THOUSAND / multiplier;
                    countArr[i]--;
                    multiplier /= TEN;
                }
            }
            x = max - min;
        }
        return count;
    }
}
