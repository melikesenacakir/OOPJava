
package ticketapp;

import java.util.LinkedList;





public class TicketApp {

    
    public static void main(String[] args) {
        Ticket t1=new StandardTicket("20-21-22",3);
        Ticket t2=new DiscountTicket("45-46",2,0.5);
        LinkedList<Ticket> tickets=new LinkedList<>();
        
        tickets.add(t1);
        tickets.add(t2);
        
        TicketSeller ts=new TicketSeller(tickets);
        for(Ticket t: tickets){
            ts.Sell(t);
        }
        System.out.println("\n");
        t1.print();
        System.out.println("Total Price: "+t1.computePrice());
        System.out.println("\n");
        t2.print();
        System.out.println("Total Price: "+t2.computePrice());
    }
    
}
