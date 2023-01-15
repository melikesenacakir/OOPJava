/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainanimal;

/**
 *
 * @author Melike
 */
public class Mainanimal {

    public static void main(String[] args) {
       Animal a1=new Duck("duck");
       Animal a2=new cat("cat");
       Animal a3=new Eagle("eagle");
       ((Duck)a1).swim();
       ((cat)a2).move();
       ((Eagle)a3).fly();
    }
    
}
