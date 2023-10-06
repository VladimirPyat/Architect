package HW4;

import java.util.ArrayList;

public class UserInterface implements iPurchaseService, iCustomerCart, iSearchTickets {
    private PurchaseService purchaseService;
    private TicketService ticketService;
    private Customer customer;
    private ArrayList<Ticket> customerChat;
    private String login;
    private String password;

    public UserInterface(String login, String password) {
        this.login = login;
        this.password = password;
        this.purchaseService = new PurchaseService();
        this.ticketService = new TicketService();
        this.customer = new CustomerService().getCustomer(login, password);
        this.customerChat = new ArrayList<>();
    }

    // ...
}
