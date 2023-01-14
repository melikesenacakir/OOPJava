
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
    }
    public double computePrice(){
        System.out.println("price before discount: "+price*number);
        return (price*number-number*price*discount);
    }
    
}
