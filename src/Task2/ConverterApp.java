package Task2;

import java.util.Scanner;

public class ConverterApp {
    private final CurrencyMenu currencyMenu;
    private final CurrencyConverter converter;
    private final CurrencyInput currencyInput;

    public ConverterApp() {
        ExchangeRates exchangeRates = new ExchangeRates();  // Курсы обмена валют
        this.currencyMenu = new CurrencyMenu();             // Меню выбора валют
        this.converter = new CurrencyConverter(exchangeRates); // Конвертер валют
        this.currencyInput = new CurrencyInput();           // Ввод суммы
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в конвертер валют!");

        // Выбор исходной валюты
        System.out.println("Выберите исходную валюту:");
        Currency fromCurrency = currencyMenu.chooseCurrency(scanner);

        // Выбор целевой валюты
        System.out.println("Выберите целевую валюту:");
        Currency toCurrency = currencyMenu.chooseCurrency(scanner);

        // Ввод суммы для конвертации
        double amount = currencyInput.getAmount(scanner, fromCurrency);

        // Конвертация валюты
        double convertedAmount = converter.convert(amount, fromCurrency, toCurrency);
        System.out.printf("%.2f %s -> %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
    }
}
