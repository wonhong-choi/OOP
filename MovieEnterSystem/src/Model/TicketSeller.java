package Model;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public void sellTicketTo(Audience audience) {
        Ticket ticket = ticketOffice.getTicket();
        int amount = audience.buyTicket(ticket);
        ticketOffice.plusAmount(amount);
    }
}
