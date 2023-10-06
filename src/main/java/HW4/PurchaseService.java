package HW4;

import java.util.ArrayList;

public class PurchaseService implements iPurchaseService, iPaymentService, iTicketsReserve {
    private TicketService ticketService;
    private PaymentService paymentService;
    private ArrayList<Transaction> transactions;

    public PurchaseService(TicketService ticketService) {
        this.ticketService = ticketService;
        this.paymentService = new PaymentService();
        this.transactions = new ArrayList<>();
    }

    public boolean orderTickets(Customer customer, ArrayList<Ticket> tickets) {
        boolean result = true;
        for (Ticket ticket : tickets) {
            int paymentID = makePayment(customer.getCustomerId(), ticket.getPrice());
            result &= isPaymentCorrect(paymentID);
            if (result) {
                ticketService.reserveTickets(ticket.getId());
            }
            Transaction transaction = new Transaction(paymentID, ticket.getId());
            transactions.add(transaction);
        }
        return result;
    }

    public boolean returnTickets(Customer customer, ArrayList<Ticket> tickets) {
        boolean result = true;
        for (Ticket ticket : tickets) {
            int paymentId = cancelPayment(customer.getCustomerId(), ticket.getId());
            result &= isPaymentCorrect(paymentId);
            if (result) {
                ticketService.unreserveTickets(ticket.getId());
            }
            Transaction transaction = new Transaction(paymentId, ticket.getId());
            transactions.add(transaction);
        }
        return result;
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



    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        System.out.println("Транзакция добавлена");
    }

    public ArrayList<Transaction> findTransaction(SearchData searchData) {
        ArrayList<Transaction> result = new ArrayList<>();
        // Ваша реализация поиска транзакций на основе данных поиска
        // Здесь мы просто возвращаем случайную транзакцию из списка для демонстрации работы
        if (!transactions.isEmpty()) {
            int randomIndex = (int) (Math.random() * transactions.size());
            result.add(transactions.get(randomIndex));
        }
        return result;
    }

    public void reserveTickets(int ticketID) {
        ticketService.reserveTickets(ticketID);
    }

    public void unreserveTickets(int ticketID) {
        ticketService.unreserveTickets(ticketID);
    }

    public int makePayment(int customerID, double amount) {

        return paymentService.makePayment(customerID, amount);
    }

    public int cancelPayment(int customerID, int paymentID) {

        return paymentService.cancelPayment(customerID, paymentID);
    }
}
