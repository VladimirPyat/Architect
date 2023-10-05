package HW4;

import java.util.ArrayList;

public interface iCustomerChat {
    void addToChat(int ticketID);
    void removeFromChat(int ticketID);
    void clearChat();
    ArrayList<Ticket> getChat();
}
