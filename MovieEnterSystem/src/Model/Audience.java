package Model;

public class Audience {
    private Bag bag;
    // private Wallet wallet;

    public int buyTicket(Ticket ticket) {
        return bag.keep(ticket);

    }

}
