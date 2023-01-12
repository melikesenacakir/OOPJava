
package ticketapp;

public abstract class Ticket {
    public int number;
    protected String seatNumber;
    Ticket(String seatNumber,int number){
        this.number=number;
        this.seatNumber=seatNumber;
    }
    public abstract void print();
    public abstract double computePrice();
}
