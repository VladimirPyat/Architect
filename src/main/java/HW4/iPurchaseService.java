package HW4;


import java.util.ArrayList;

public interface iPurchaseService {
    boolean orderTickets(Customer customer, ArrayList<Ticket> tickets);
    boolean returnTickets(Customer customer, ArrayList<Ticket> tickets);
}
