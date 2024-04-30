package Model;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {
    private List<Ticket> tickets = new ArrayList<>();
    private int amount;

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void plusAmount(int amount) {
        this.amount += amount;
    }
}
