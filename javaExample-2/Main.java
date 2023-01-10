/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Melike
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1=new Student("melike",20,90);
        Student s2=new Student("Sena",45,98);
        s1.ShowStudentInfoAndScore();
        s2.ShowStudentInfoAndScore();
        System.out.printf("\n\n");
        System.out.println(s1.name+" score average: "+s1.Calculatescore());
        System.out.println(s2.name+" score average: "+s2.Calculatescore());
    }
    
}
