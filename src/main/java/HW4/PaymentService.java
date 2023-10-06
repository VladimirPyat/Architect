package HW4;

import java.util.Random;

public class PaymentService {
    private Random random;

    public PaymentService() {
        random = new Random();
    }

    public int makePayment(int customerId, double payAmount) {
        int paymentId = random.nextInt(10) + 10; // Коды успешных операций от 11 до 19, 10 - ошибка
        // Логика для определения типа операции на основе customerId
        if (String.valueOf(customerId).startsWith("1")) {
            // Тип операции - покупка
            return paymentId;
        } else {
            // Тип операции - ошибка
            return paymentId * 10;
        }
    }

    public int cancelPayment(int customerId, int paymentId) {
        int cancellationId = random.nextInt(10) + 20; // Коды успешных операций от 21 до 29, 20 - ошибка
        // Логика для определения типа операции на основе paymentId
        if (String.valueOf(paymentId).startsWith("2")) {
            // Тип операции - отмена
            return cancellationId;
        } else {
            // Тип операции - ошибка
            return cancellationId * 10;
        }
    }

    public boolean isPaymentCorrect(int paymentId) {
        // Логика для проверки типа операции на основе paymentId
        if (String.valueOf(paymentId).endsWith("0")) {
            // Ошибка
            return false;
        } else {
            // Платеж успешен
            return true;
        }
    }
}
