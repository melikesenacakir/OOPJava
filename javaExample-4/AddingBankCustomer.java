
package addingbankcustomer;
import java.util.ArrayList;
import java.util.Collections;


public class AddingBankCustomer {


    public static void main(String[] args) {
       ArrayList<BankAccount> myAccount=new ArrayList<>();
       BankAccount b1=new BankAccount(12,"M",100.67);
       BankAccount b2=new BankAccount(13,"S",99999.6);
       BankAccount b3=new BankAccount(14,"C",8876.45);
       BankAccount b4=new BankAccount(15,"F",8754.555);
  
       myAccount.add(b1);
       myAccount.add(b2);
       myAccount.add(b3);
       myAccount.add(b4);
       
       for(BankAccount a: myAccount){
           System.out.println(a.toString());
       }
       
       
       System.out.println("\n");
       System.out.println("before sorting: ");
       for(BankAccount a: myAccount){
           System.out.println(a.holdername);
       }
       Collections.sort(myAccount);
       System.out.println("\n");
       System.out.println("after sorting: ");
       for(BankAccount a: myAccount){
           System.out.println(a.holdername);
       }
       
       for(BankAccount b: myAccount){
           try{
               b.balanceChange(500);
           }catch(Exception e){
               System.out.println(e.getMessage());
           }
            
        }
        
        for(BankAccount ba: myAccount){
            System.out.println(ba.toString());
        }
        
    }
    
 }

