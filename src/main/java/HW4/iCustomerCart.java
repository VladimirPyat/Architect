package HW4;

import java.util.ArrayList;

public interface iCustomerCart {
    void addToCart(int ticketIndex);
    void removeFromCart(int ticketIndex);
    void clearCart();
    ArrayList<Ticket> getCart();
}
