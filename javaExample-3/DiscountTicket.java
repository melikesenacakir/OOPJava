
package ticketapp;

public class DiscountTicket extends StandardTicket{
    protected double discount;
    DiscountTicket(String seatNumber,int number,double discount){
        super(seatNumber,number);
        this.discount=discount;
        this.seatNumber=seatNumber;
    }
    public void print(){
        System.out.println("Seatnumber: "+seatNumber+" How many tickets? : "+number+" Discount per ticket : "+discount);
        System.out.println("price before discount: "+price*number);
    }
    public double computePrice(){
        return (price*number-number*price*discount);
    }
    public String toString(){
        return "Seatnumber: "+seatNumber+" How many tickets? : "+number+" Discount per ticket : "+discount;
    }
}
