
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
        this.balance=amount;
        return --amount;
    }
    public String toString(){
        return "account no: "+accountNo+" name: "+holdername+" balance: "+balance;
    }

    public int compareTo(BankAccount b){
        return this.holdername.compareTo(b.holdername);
    }
}
