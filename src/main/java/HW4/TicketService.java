package HW4;

import java.util.ArrayList;

public class TicketService implements iSearchTickets, iCustomerCart, iTicketsReserve {
    private ArrayList<Ticket> customerCart;
    private ArrayList<Ticket> searchResult;
    private TicketProvider ticketProvider;

    public TicketService() {
        this.customerCart = new ArrayList<>();
        this.searchResult = new ArrayList<>();
        this.ticketProvider = new TicketProvider();
    }

    public ArrayList<Ticket> searchTickets(SearchData searchData) {
        searchResult = ticketProvider.searchTickets(searchData);
        return searchResult;
    }

    public void addToCart(int ticketIndex) {
        if (ticketIndex >= 0 && ticketIndex < searchResult.size()) {
            Ticket ticket = searchResult.get(ticketIndex);
            customerCart.add(ticket);
            System.out.println("Билет с индексом " + ticketIndex + " добавлен в корзину");
        }
    }

    public void removeFromCart(int ticketIndex) {
        if (ticketIndex >= 0 && ticketIndex < customerCart.size()) {
            customerCart.remove(ticketIndex);
            System.out.println("Билет с индексом " + ticketIndex + " удален из корзины");
        }
    }

    public void clearCart() {
        customerCart.clear();
        System.out.println("Корзина очищена");
    }

    public ArrayList<Ticket> getCart() {
        return new ArrayList<>(customerCart);
    }

    public TicketData getTicketData(Ticket ticket) {
        return ticket.getTicketData();
    }

    @Override
    public void reserveTickets(int ticketID) {
        ticketProvider.reserveTickets(ticketID);
    }

    @Override
    public void unreserveTickets(int ticketID) {
        ticketProvider.unreserveTickets(ticketID);

    }
}
