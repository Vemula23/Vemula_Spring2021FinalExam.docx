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
public class UniformDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Venkatesh Vemula ");
        System.out.println(" Answer for uniform Abstract in question no 1 : ");
        Sheriff vem = new Sheriff ("venkatesh", 5, 68);
        vem.uniformColor();
        System.out.println("************");
        vem.name();
        System.out.println("*************");
        vem.height();
        System.out.println("************");
        vem.weight();
    }
    
}
