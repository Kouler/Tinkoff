package edu.project1;

import java.util.Arrays;
import java.util.Scanner;

public final class ConsoleHangman {

    private String helloPicture = "-------------------------\n|  --\\   HANGMAN   /--  |\n-------------------------";
    private String word = "";
    private String hiddenWord = "";
    private boolean[] usedLetters = new boolean['z' - 'a' + 1];
    private final int maxAttempts = 5;

    public void run(int idx) {
        System.out.println(helloPicture);

        String answer = "";
        Scanner in = new Scanner(System.in);
        var generator = new WordGenerator();

        while (!answer.equals("no")) {
            System.out.println("Are you ready to play this? (yes/no)");
            answer = in.nextLine();
            switch (answer) {
                case "no":
                    System.out.println("Ok! See you later!");
                    continue;
                case "yes":
                    break;
                default:
                    System.out.println("!![Incorrect answer, try again...]!!");
                    continue;
            }

            word = generator.getRandomWord(idx); //генерим слово
            hiddenWord = "*".repeat(word.length()); //создаём такой же длины скрытое слово
            Arrays.fill(usedLetters, false); //обнуляем использованные в прошлой игре буквы

            int attempts = 0; //обнуляем попытки

            while (attempts < maxAttempts) {
                System.out.println("Enter your letter: ");
                answer = in.nextLine().toLowerCase();
                if (ifNotAChar(answer)) {
                    System.out.println("!!![You should write only one char. Try again...]!!!");
                    continue;
                }

                if (usedLetters[answer.charAt(0) - 'a']) {
                    System.out.println("!!![Already have been used, choose another one...]!!!");
                    continue;
                }

                usedLetters[answer.charAt(0) - 'a'] = true;

                if (isInWord(answer.charAt(0))) {
                    System.out.println("Hit!");
                } else {
                    attempts++;
                    System.out.printf("Missed, mistake %d out of %d.\n", attempts, maxAttempts);
                }

                System.out.printf("The word is: %s\n", hiddenWord);

                if (hiddenWord.equals(word)) {
                    System.out.println("You Won!!!\n");
                    break;
                }
            }

            if (attempts >= maxAttempts) {
                System.out.println("You loose:(\n");
            }
        }
    }

    private boolean isInWord(char c) {
        boolean found = false;
        StringBuilder stringChanger = new StringBuilder(hiddenWord);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                found = true;
                stringChanger.setCharAt(i, c);
            }
        }
        hiddenWord = stringChanger.toString();
        return found;
    }

    private boolean ifNotAChar(String answer) {
        if (answer.length() != 1 || (answer.charAt(0) < 'a' || answer.charAt(0) > 'z')) {
            return true;
        }
        return false;
    }

}
