package Task1;

import java.util.Random;

public class WordGenerator {
    // Набор слов для угадывания
    private static final String[] WORDS = {
            "computer", "java", "programming", "hangman", "developer", "algorithm",
            "interface", "inheritance"
    };

    public String getRandomWord() { // Случайный выбор слова
        Random random = new Random();
        return WORDS[random.nextInt(WORDS.length)];
    }
}
