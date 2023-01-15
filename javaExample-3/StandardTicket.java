
package ticketapp;

public class StandardTicket extends Ticket{
    protected double price=40;
    StandardTicket(String seatNumber,int number){
        super(seatNumber,number);
        this.seatNumber=seatNumber;
    }
    public void print(){
        System.out.println("seatnumber: "+this.seatNumber+" How many people? : "+this.number+" price: "+price);
    }
    public double computePrice(){
        return price*number;
    }
    public String toString(){
        return "seatnumber: "+this.seatNumber+" How many people? : "+number+" price: "+price;
    }
}
