package edu.hw1;

public final class Task6 {
    public static int countK(int x) {
        if (x <= 1000 || x > 9999) return -1;
        int count = 0;
        // Диапазон значений для нашего числа как массива не большой - всего 10 значений,
        // а => будем сортировать подсчётом за O(n)
        for (; x != 6174; count++) { // решил так, не хочу в while писать count++ снизу
            //массив подсчёта
            int[] count_arr = new int[10];
            for (int i = 0; i < 4; i++) {
                //считаем по цифре
                int idx = x % 10;
                count_arr[idx]++;
                x/= 10;
                // и сразу, если вдруг кол-во цифр будем равно 4, то число содержит
                // только одинаковые цифры => дадим код ошибки для этого случая -2 уже, а не -1
                if (count_arr[idx] > 3) return -2;

            }

            int max = 0, min = 0;
            int multiplier = 1000;
            //"сортируем" "реверсивно" относительно множителя multiplier
            for (int i = 0; i < 10; i++) {
                while (count_arr[i] > 0) {
                    min+= i*( multiplier );
                    max+= i*( 1000/multiplier );
                    count_arr[i]--;
                    multiplier/= 10;
                }
            }
            x = max - min;
        }
        return count;
    }
}
