package Task2;

import java.util.HashMap;
import java.util.Map;

public class ExchangeRates {
    private final Map<Currency, Double> rates;

    public ExchangeRates() {
        rates = new HashMap<>();

        // Задаем фиксированные курсы валют относительно условной базовой валюты (например, USD)
        rates.put(Currency.USD, 1.00);   // 1 USD = 1.00
        rates.put(Currency.EUR, 0.85);   // 1 USD = 0.85 EUR
        rates.put(Currency.GBP, 0.75);   // 1 USD = 0.75 GBP
        rates.put(Currency.RUB, 75.00);  // 1 USD = 75.00 RUB
        rates.put(Currency.JPY, 110.00); // 1 USD = 110.00 JPY
    }

    // Метод для получения курса обмена
    public double getRate(Currency currency) {
        return rates.getOrDefault(currency, 1.0);
    }
}
