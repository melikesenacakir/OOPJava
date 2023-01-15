
package ticketapp;

public abstract class Ticket implements Comparable<Ticket>{
    public int number;
    protected String seatNumber;
    Ticket(String seatNumber,int number){
        this.number=number;
        this.seatNumber=seatNumber;
    }
    public abstract void print();
    public abstract double computePrice();
    public abstract String toString();
    public int compareTo(Ticket t){
        if(this.number>t.number)
            return 1;
        else if(this.number<t.number)
            return -1;
        else
            return 0;
    }
    
}
