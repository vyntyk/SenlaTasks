package Task3;

public class Validator {

    // Метод для проверки допустимой длины пароля
    public boolean isValidLength(int length) {
        return length < 8 || length > 12;
    }
}

