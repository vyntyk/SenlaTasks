package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    private static final int MAX_LIVES = 6;
    private final String wordToGuess;
    private final char[] guessedWord;
    private int lives;
    private final boolean[] guessedLetters;
    private final Scanner scanner;

    public Hangman() {
        WordGenerator wordGenerator = new WordGenerator();
        this.wordToGuess = wordGenerator.getRandomWord().toUpperCase();
        this.guessedWord = new char[wordToGuess.length()];
        Arrays.fill(guessedWord, '_');
        this.lives = MAX_LIVES;
        this.guessedLetters = new boolean[26]; // Для всех букв английского алфавита
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (lives > 0 && !isWordGuessed()) {
            System.out.println("Текущее слово: " + String.valueOf(guessedWord));
            System.out.println("Осталось жизней: " + lives);
            Gallows.drawHangman(MAX_LIVES - lives);
            System.out.print("Введите букву: ");
            char guess = scanner.nextLine().toUpperCase().charAt(0);

            if (!Character.isLetter(guess)) {
                System.out.println("Пожалуйста, введите букву.");
                continue;
            }

            int letterIndex = guess - 'A';
            if (guessedLetters[letterIndex]) {
                System.out.println("Вы уже угадывали эту букву.");
                continue;
            }

            guessedLetters[letterIndex] = true;

            if (wordToGuess.indexOf(guess) >= 0) {
                updateGuessedWord(guess);
            } else {
                lives--;
                System.out.println("Неверно! Такой буквы нет.");
            }
        }

        if (lives > 0) {
            System.out.println("Поздравляю! Вы угадали слово: " + wordToGuess);
        } else {
            Gallows.drawHangman(MAX_LIVES - lives);
            System.out.println("Вы проиграли! Слово было: " + wordToGuess);
        }
    }

    private void updateGuessedWord(char guess) {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                guessedWord[i] = guess;
            }
        }
    }

    private boolean isWordGuessed() {
        for (char c : guessedWord) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}
