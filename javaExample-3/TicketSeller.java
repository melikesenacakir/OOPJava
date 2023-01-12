
package ticketapp;

import java.util.List;

public class TicketSeller {
    List<Ticket> tickets;
    private double incomes;
    static int i=1;
    TicketSeller(List<Ticket> tickets){
        this.tickets=tickets;
    }
    public void Sell(Ticket ticket){
        System.out.println("for "+i+".customer"+" selled tickets are: "+ticket.number);
        i++;
    }
    public double getincomes(){
        return incomes;
    }
}
