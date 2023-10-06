package HW4;

import java.util.ArrayList;
import java.util.Random;

public class TicketProvider implements iSearchTickets, iTicketsReserve {
    private ArrayList<Ticket> searchResult;

    public TicketProvider() {
        this.searchResult = new ArrayList<>();
    }

    public ArrayList<Ticket> searchTickets(SearchData searchData) {
        int numTickets = new Random().nextInt(4) ;       //Случайное число билетов в выдаче от 0 до 3

        // Генерация случайных билетов для результата поиска
        for (int i = 0; i < numTickets; i++) {
            TicketData ticketData = new TicketData("");
            Ticket ticket = new Ticket(ticketData);
            searchResult.add(ticket);
        }

        return searchResult;
    }

    public void reserveTickets(int ticketID) {
        System.out.println("Билет с ID " + ticketID + " зарезервирован");
    }

    public void unreserveTickets(int ticketID) {
        System.out.println("Резерв на билете с ID " + ticketID + " снят");
    }
}
