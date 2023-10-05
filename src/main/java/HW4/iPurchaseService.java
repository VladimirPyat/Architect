package HW4;


import java.util.ArrayList;

public interface iPurchaseService {
    void orderTickets(int clientID, ArrayList<Ticket> tickets);
    void returnTickets(int clientID, ArrayList<Ticket> tickets);
}
