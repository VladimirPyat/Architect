package HW4;

import java.util.ArrayList;

public class UserInterface implements iPurchaseService, iCustomerChat, iSearchTickets {
    private PurchaseService purchaseService; // поле для работы с сервисом покупки билетов
    private TicketsService ticketsService; // поле для работы с сервисом билетов
    private Customer customer; // поле для хранения информации о клиенте
    private ArrayList<Ticket> customerChat; // поле для хранения корзины клиента
    private String login; // поле для хранения логина клиента
    private String password; // поле для хранения пароля клиента

    public UserInterface(String login, String password) {
        this.login = login;
        this.password = password;
        this.purchaseService = new PurchaseService();
        this.ticketsService = new TicketsService();
        this.customer = new CustomerService().getCustomer(login, password);
        this.customerChat = new ArrayList<>();
    }

    @Override
    public void addToChat(int ticketID) {

    }

    @Override
    public void removeFromChat(int ticketID) {

    }

    @Override
    public void clearChat() {

    }

    @Override
    public ArrayList<Ticket> getChat() {
        ArrayList<Ticket> tickets = new ArrayList<>();
        return tickets;
    }

    @Override
    public void orderTickets(int clientID, ArrayList<Ticket> tickets) {

    }

    @Override
    public void returnTickets(int clientID, ArrayList<Ticket> tickets) {

    }

    @Override
    public ArrayList<Ticket> searchTickets(SearchData searchData) {
        ArrayList<Ticket> tickets = new ArrayList<>();
        return tickets;
    }


    // ...
}
