/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookmain;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Bookmain {

    public static void main(String[] args) {
        Book b1=new Book("The Rock of Tanios",69);
        Book b2=new Book("hobbit",70);
        Book b3=new Book("the little prince",45);
        Book b4=new Book("harry potter-1",87);
        LinkedList books=new LinkedList();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        Collections.sort(books);
        ListIterator iter=books.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    
}
