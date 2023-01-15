/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainanimal;

/**
 *
 * @author Melike
 */
public class Duck extends Animal implements Moveable,Flyable,Swimmable {
    Duck(String name){
        super(name);
    }
    public void swim(){
        System.out.println(name+" is swimming");
    }
    public void fly(){
        System.out.println(name+" is flying");
    }
    public void move(){
        System.out.println(name+" is moving");
    }
    
}
