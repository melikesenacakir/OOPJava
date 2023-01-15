/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentapp;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {

    public static void main(String[] args) {
       Student s1=new MasterStudent(2,34,56,12);
       Student s2=new PhDStudent(3,45,67,87,90);
       Student s3=new BachelourStudent(5,67,98);
       List<Student> students=new ArrayList();
       students.add(s1);
       students.add(s2);
       students.add(s3);
       int i=1;
       for(Student s: students){
           System.out.println(i+". Base score:"+s.computeBaseScore());
           i++;
       }
       System.out.println("Conference Score:"+((MasterStudent)s1).conferenceScore());
       
    }
    
}
