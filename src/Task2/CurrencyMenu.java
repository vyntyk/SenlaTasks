package Task2;

import java.util.Scanner;

public class CurrencyMenu {
    // Метод для вывода списка валют и выбора валюты по цифре
    public Currency chooseCurrency(Scanner scanner) {
        System.out.println("1. USD (Доллар США)");
        System.out.println("2. EUR (Евро)");
        System.out.println("3. GBP (Фунт стерлингов)");
        System.out.println("4. RUB (Российский рубль)");
        System.out.println("5. JPY (Японская иена)");

        int choice = 0;
        while (choice < 1 || choice > 5) {
            System.out.print("Выберите валюту (введите число от 1 до 5): ");
            choice = scanner.nextInt();
            if (choice < 1 || choice > 5) { // Проверка ввода цифры
                System.out.println("Ошибка! Введите число от 1 до 5.");
            }
        }

        return switch (choice) {
            case 1 -> Currency.USD;
            case 2 -> Currency.EUR;
            case 3 -> Currency.GBP;
            case 4 -> Currency.RUB;
            case 5 -> Currency.JPY;
            default -> Currency.USD; // Не должно случиться, так как выбор проверен
        };
    }
}
