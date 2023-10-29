package edu.hw3;




public class Task4 {

    private static final int MAX_NUMBER = 3999; //MMMCMXCIX
    private static final int[] NUMBERS = {
        1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000
    };

    private static final String[] STRINGS = {
        "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"
    };

    private Task4() {
    }

    public static String convertToRoman(int n) {
        int number = n;

        if (MAX_NUMBER < number || number <= 0) {
            return null;
        }

        StringBuilder string = new StringBuilder();

        for (int i = NUMBERS.length - 1; i >= 0; i--) {
            while (number - NUMBERS[i] >= 0) {
                number -= NUMBERS[i];
                string.append(STRINGS[i]);
            }
        }

        return string.toString();
    }
}
