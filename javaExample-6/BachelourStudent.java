/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentapp;


public class BachelourStudent extends Student implements ProjectScoreBehaviour{
    BachelourStudent(int id,float mid,float fin){
        super(id,mid,fin);
        this.id=id;
        this.mid=mid;
        this.fin=fin;
    }
    public float computeTotalScore(){
        return computeBaseScore()+projectScore();
    }
    public float projectScore(){
        return 20;
    }
}
