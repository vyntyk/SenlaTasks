package Task2;

import java.util.Scanner;

public class CurrencyInput {
    // Метод для запроса суммы у пользователя
    public double getAmount(Scanner scanner, Currency fromCurrency) {
        System.out.printf("Введите сумму в валюте %s: ", fromCurrency);
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка! Введите корректное число.");
            scanner.next(); // Очищаем некорректный ввод
        }
        return scanner.nextDouble();
    }

}