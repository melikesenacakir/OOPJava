/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Melike
 */
public class Student {
    String name;
    float midterm;
    float finalExam;
    Student(String name,int midterm,int finalExam){
        this.name=name;
        this.midterm=midterm;
        this.finalExam=finalExam;
    }
    public float Calculatescore(){
        return midterm*0.4f + finalExam*0.6f;
    }
    void ShowStudentInfoAndScore(){
        System.out.println("isim: "+this.name+" midterm: "+this.midterm+" final: "+this.finalExam);
    }
}
