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

        this.ticketService = new TicketService();
        this.purchaseService = new PurchaseService(this.ticketService);
        this.customer = new CustomerService().getCustomer(login, password);
        this.customerChat = new ArrayList<>();
    }

    @Override
    public ArrayList<Ticket> searchTickets(SearchData searchData) {
        ArrayList<Ticket> searchResult = ticketService.searchTickets(searchData);
        return searchResult;
    }

    @Override
    public void addToCart(int ticketIndex) {
        ticketService.addToCart(ticketIndex);
    }

    @Override
    public void removeFromCart(int ticketIndex) {
        ticketService.removeFromCart(ticketIndex);
    }

    @Override
    public void clearCart() {
        ticketService.clearCart();
    }

    @Override
    public ArrayList<Ticket> getCart() {
        customerChat = ticketService.getCart();
        return customerChat;
    }

    @Override
    public boolean orderTickets(Customer customer, ArrayList<Ticket> tickets) {
        return purchaseService.orderTickets(customer, tickets);
    }

    public boolean orderTickets(ArrayList<Ticket> tickets) {
        return purchaseService.orderTickets(this.customer, tickets);
    }

    @Override
    public boolean returnTickets(Customer customer, ArrayList<Ticket> tickets) {
        return purchaseService.returnTickets(customer, tickets);
    }

    public boolean returnTickets(ArrayList<Ticket> tickets) {
        return purchaseService.returnTickets(this.customer, tickets);
    }



}
