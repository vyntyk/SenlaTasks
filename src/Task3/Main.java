package Task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в генератор паролей!");

        // Получаем длину пароля
        PasswordInput passwordInput = new PasswordInput();
        int length = passwordInput.getPasswordLength();

        // Генерация пароля
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String password = passwordGenerator.generatePassword(length);

        // Вывод сгенерированного пароля
        System.out.println("Сгенерированный пароль: " + password);
    }
}
