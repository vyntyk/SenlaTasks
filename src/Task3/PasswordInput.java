package Task3;

import java.util.Scanner;

public class PasswordInput {
    private final Validator validator = new Validator();
    private final Scanner scanner = new Scanner(System.in);

    // Метод для получения длины пароля с проверкой
    public int getPasswordLength() {
        int length = 0;
        while (validator.isValidLength(length)) {
            System.out.print("Введите длину пароля (от 8 до 12 символов): ");
            length = scanner.nextInt();
            if (validator.isValidLength(length)) {
                System.out.println("Ошибка! Длина пароля должна быть от 8 до 12 символов.");
            }
        }
        return length;
    }
}
