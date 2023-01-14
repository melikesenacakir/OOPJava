
package addingbankcustomer;

public class BankAccount implements Comparable<BankAccount>{
    int accountNo;
    String holdername;
    double balance;
    BankAccount(int accountNo,String holdername,double balance){
        this.accountNo=accountNo;
        this.balance=balance;
        this.holdername=holdername;
    }
    public double balanceChange(double amount){
        this.balance-=amount;
        if(balance<0){
            this.balance+=amount;
            throw new IllegalArgumentException("for account "+accountNo+" balance can't be lower than zero");
        }    
        return balance;
    }
    public String toString(){
        return "account no: "+accountNo+" name: "+holdername+" balance: "+(float)balance;
    }

    public int compareTo(BankAccount b){
        return this.holdername.compareTo(b.holdername);
    }
}
