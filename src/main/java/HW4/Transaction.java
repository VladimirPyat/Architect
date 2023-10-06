package HW4;

import java.time.LocalDateTime;

public class Transaction {
    private int paymentId;
    private int customerId;
    private int ticketId;
    private LocalDateTime date;
    private double price;
    private OperationType operationType;

    public Transaction(int paymentId, int customerId, int ticketId, LocalDateTime date, double price) {
        this.paymentId = paymentId;
        this.customerId = customerId;
        this.ticketId = ticketId;
        this.date = date;
        this.price = price;

    }

    public Transaction(int paymentId) {
        this(paymentId, 0, 0, null, 0.0);
    }


    @Override
    public String toString() {
        return "Transaction [paymentId=" + paymentId + ", customerId=" + customerId + ", ticketId=" + ticketId + ", date=" + date + ", price=" + price + ", operationType=" + operationType + "]";
    }
}
