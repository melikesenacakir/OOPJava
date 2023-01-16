/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookmain;


public class Book implements Comparable<Book>{
    String name;
    double price;
    Book(String name,double price){
        this.name=name;
        this.price=price;
    }
    public float totalprice(){
        return (float)(price+0.8*price);
    }
    public int compareTo(Book b){
        return (int)(this.price-b.price);
    }
    public String toString(){
        return "Name: "+name+" Price: "+price;
    }
}
