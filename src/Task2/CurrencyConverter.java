package Task2;

public class CurrencyConverter {
    private final ExchangeRates exchangeRates;

    public CurrencyConverter(ExchangeRates exchangeRates) {
        this.exchangeRates = exchangeRates;
    }

    // Метод для конвертации валюты
    public double convert(double amount, Currency fromCurrency, Currency toCurrency) {
        double fromRate = exchangeRates.getRate(fromCurrency);
        double toRate = exchangeRates.getRate(toCurrency);

        // Формула для конвертации: amount * (курс целевой валюты / курс исходной валюты)
        return amount * (toRate / fromRate);
    }
}
