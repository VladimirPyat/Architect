package HW4;

import java.util.ArrayList;

public class Customer {
    private int id;
    private CustomerData customerData;
    private ArrayList<Ticket> tickets;

    public Customer(int id, CustomerData customerData) {
        this.id = id;
        this.customerData = customerData;
        tickets = new ArrayList<>();
    }


    public CustomerData getCustomerData() {
        return customerData;
    }

    public ArrayList<Ticket> getTickets() {
        return new ArrayList<>(tickets);
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
        System.out.println("Билет добавлен");
    }

    public void removeTicket(int index) {
        if (index >= 0 && index < tickets.size()) {
            tickets.remove(index);
            System.out.println("Билет удален");
        }
    }

    public void listTickets() {
        System.out.println("Список билетов покупателя:");
        for (int i = 0; i < tickets.size(); i++) {
            System.out.println(i + 1 + ": " + tickets.get(i));
        }
    }

    public int getCustomerId() {
        return id;
    }
}
