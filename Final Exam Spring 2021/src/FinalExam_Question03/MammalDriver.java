/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExam_Question03;

/**
 *
 * @author Venkatesh Vemula
 */
public class MammalDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Venkatesh Vemula ");
        System.out.println(" Answer for Casting in question no 3 ");
        //Upcasting
        System.out.println("--------------------------------Upcasting Example-------------------------------------");
        Animals a = new Cow();
        a.eating();
        a.moving();
        System.out.println("--------------------------------Downcasting Example-------------------------------------");
        //down casting
        Animals anim = new Cow();
        Cow c = (Cow) anim;

        c.eating();
        c.moving();
    }

}
