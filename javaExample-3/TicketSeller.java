
package ticketapp;

import java.util.List;

public class TicketSeller {
    List<Ticket> tickets;
    private double incomes;
    TicketSeller(List<Ticket> tickets){
        this.tickets=tickets;
    }
    public void Sell(Ticket ticket){
        incomes+=ticket.computePrice();
        System.out.println(ticket.seatNumber+" is sold");
        tickets.remove(ticket);
    }
    public double getincomes(){
        return incomes;
    }

}
