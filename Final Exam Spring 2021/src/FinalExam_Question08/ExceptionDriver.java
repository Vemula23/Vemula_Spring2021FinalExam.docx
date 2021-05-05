/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExam_Question08;

import static FinalExam_Question08.ExceptionHandling.MethodWithMultipleExc;
import java.io.IOException;

/**
 *
 * @author S542404
 */
public class ExceptionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Answer for the Exception Question 08 : Venkatesh Vemula");
        try {
            MethodWithMultipleExc();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("String has length less than 3");
        }
    }
}


    

