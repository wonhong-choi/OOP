package Model;

public class Bag {
    private Invitation invitation;
    private Ticket ticket;
    private int money;
    
    public int keep(Ticket ticket) {
        if(hasInvitation()){
            setTicket(ticket);
            return 0;
        }
        else{
            setTicket(ticket);
            minusAmout(ticket.getFee());
            return ticket.getFee();
        }
    }

    private boolean hasInvitation(){
        return invitation != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmout(int fee) {
        money -= fee;
    }

    
}
