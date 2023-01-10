/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

public class Dog {
    private String name;
    private int age;
    private String color;
    public static int counter=0;
    
    public Dog(String name,int age,String color){
        this.name=name;
        this.color=color;
        this.age=age;
        ++Dog.counter;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name.equals("haski")){
            throw new IllegalArgumentException(name+" is not find in animal shelter");
        }
        System.out.println(this.name+"'s name has been updated,new name is: ");
        this.name=name;
        System.out.println(this.name);
    }
    public String getcolor(){
        return this.color;
    }
    public void setcolor(String color){
        if(color.equals("mavi")){
            throw new IllegalArgumentException("a dog cannot be this color");
        }
        this.color=color;
        System.out.println(this.name+"'s color has been updated! new color: "+this.color); 
      }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age<0 || age>20){
            throw new IllegalArgumentException("a dog cannot be this age");
        }
        this.age=age;
        System.out.println(this.name+"'s age has been updated, new age: "+this.age);
    }
    public int HowDog(){
        return Dog.counter;
    }
        
        
    
}
