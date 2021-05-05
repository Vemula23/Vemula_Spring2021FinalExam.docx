/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExam_Question01;

/**
 *
 * @author Venkatesh Vemula
 */
public class SoftwareEngineer implements Engineer{
 private String name;
 private int age;

    public SoftwareEngineer(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    @Override
    public void course() {
        System.out.println(" My course is Computer Science ");
    }

    @Override
    public void noOfCredits() {
         System.out.println(" No of credits is 30 ");
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" + "name=" + name + ", age=" + age + '}';
    }
    
}
