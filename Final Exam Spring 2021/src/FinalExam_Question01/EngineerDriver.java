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
public class EngineerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println(" Venkatesh Vemula ");
        System.out.println(" Answer for Engineering Interface in Question no 1 : ");
        SoftwareEngineer Soft = new SoftwareEngineer("Vemula", 20);
        Soft.course();
        Soft.noOfCredits();
        System.out.println(" Engineer details : ");
        System.out.println(Soft.toString());
        System.out.println("**************");
        
        MechanicalEngineer mech = new MechanicalEngineer("Venkatesh", 21);
        mech.course();
        mech.noOfCredits();
        System.out.println(" Engineer details : ");
        System.out.println(mech.toString());
        
    }
    
}
