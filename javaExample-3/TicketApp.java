
package ticketapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TicketApp {

    
    public static void main(String[] args) {
        Ticket t1=new StandardTicket("20-21-22",3);
        Ticket t2=new StandardTicket("56",1);
        Ticket t3=new DiscountTicket("45-46",2,0.5);
        Ticket t4=new DiscountTicket("24-25-33-35",4,0.7);
        List<Ticket> tickets=new ArrayList<>();
        
        tickets.add(t1);
        tickets.add(t2);
        tickets.add(t3);
        tickets.add(t4);
        
        for(Ticket v: tickets){
             System.out.println(v.number);
         }
        
        Collections.sort(tickets);
        
        System.out.println("sorted according the numbers");
         for(Ticket v: tickets){
             System.out.println(v.number);
         }
        System.out.println("\n");
        
        for(Ticket v: tickets){
            v.print();
            System.out.println("total price:"+v.computePrice());
            System.out.println("\n");
        }
        
        TicketSeller ts=new TicketSeller(tickets);
        int i=0;
        while(tickets.size()!=i){
            ts.Sell(tickets.get(i));
        }

       
        
    }
    
}
