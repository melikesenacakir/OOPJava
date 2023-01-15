/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainanimal;

/**
 *
 * @author Melike
 */
public class Eagle extends Animal implements Flyable{
    Eagle(String name){
        super(name);
    }
    public void fly(){
        System.out.println(name+" is flying");
    }
}
