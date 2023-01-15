/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentapp;

/**
 *
 * @author Melike
 */
public abstract class Student {
    int id;
    float mid;
    float fin;
    Student(int id,float mid,float fin){
        this.fin=fin;
        this.id=id;
        this.mid=mid;
    }
    public abstract float  computeTotalScore();
    public float computeBaseScore(){
        return (float)(mid*0.4+fin*0.6);
    }
}
