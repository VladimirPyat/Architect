package HW4;

public interface iPaymentService {
    int makePayment(int customerID, double amount);
    int cancelPayment(int customerID, int paymentID);
}
