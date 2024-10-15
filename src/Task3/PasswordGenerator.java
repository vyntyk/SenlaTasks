package Task3;

import java.util.Random;

public class PasswordGenerator {
    private static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

    private static final String ALL_CHARACTERS = UPPERCASE_LETTERS + LOWERCASE_LETTERS + DIGITS + SPECIAL_CHARACTERS;

    public String generatePassword(int length) {
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);

        // Добавляем минимум один символ каждого типа
        password.append(UPPERCASE_LETTERS.charAt(random.nextInt(UPPERCASE_LETTERS.length())));
        password.append(LOWERCASE_LETTERS.charAt(random.nextInt(LOWERCASE_LETTERS.length())));
        password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        password.append(SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length())));

        // Заполняем оставшиеся символы
        for (int i = 4; i < length; i++) {
            password.append(ALL_CHARACTERS.charAt(random.nextInt(ALL_CHARACTERS.length())));
        }

        // Перемешиваем символы, чтобы пароль был более случайным
        return shufflePassword(password.toString());
    }

    // Метод для перемешивания символов в строке
    private String shufflePassword(String password) {
        char[] passwordArray = password.toCharArray();
        Random random = new Random();
        for (int i = passwordArray.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            char temp = passwordArray[i];
            passwordArray[i] = passwordArray[index];
            passwordArray[index] = temp;
        }
        return new String(passwordArray);
    }
}
