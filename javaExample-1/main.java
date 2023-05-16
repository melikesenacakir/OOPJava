
package main;

public class main {

    public static void main(String[] args) {
        int i=1;
        Dog d1=new Dog("golden",11,"gold");
        Dog d2=new Dog("Base",18,"black-brown");
        Dog d3=new Dog("Pug",4,"brown");
        
        Dog[] dog={d1,d2,d3};
        System.out.println("there are: "+d1.HowDog()+" dogs in the shelter "+"\n");
        for(Dog value: dog){
            System.out.println(i+".dog"+" name: "+value.getName()+" color: "+value.getcolor()+" age: "+value.getAge());
            System.out.println("\n");
            i++;
        }
        try{
           d1.setAge(6);
           d2.setName("haski");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       
    }
    
}
