package HW4;

import java.util.Random;

public class Ticket {
    private int id;
    private TicketData ticketData;
    private int price;

    public Ticket(TicketData ticketData) {
        this.id = generateId();
        this.ticketData = ticketData;
        this.price = generatePrice();
    }



    public TicketData getTicketData() {
        return ticketData;
    }

    public int getPrice() {
        return price;
    }




    private int generateId() {
        // id берется из базы данных либо генератор уникальных чисел
        // в примере просто используем генерацию случайного числа
        Random random = new Random();
        return random.nextInt();
    }

    private int generatePrice() {
        // цена берется из базы данных
        // в примере просто генерация случайного числа в диапазоне от 500 до 5000
        Random random = new Random();
        return random.nextInt(4500) + 500;
    }

    public int getID() {
        return id;
    }
}
