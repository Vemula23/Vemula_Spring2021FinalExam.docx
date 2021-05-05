/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExam_Question10;

/**
 *
 * @author Venkatesh Vemula
 */
public class RecursionDriver {

    /**
     * @param args the command line arguments
     */
    
    static int fact(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * fact(a - 1);
        }

    }

    public static int inti_fact(int a) {
        return a * inti_fact(a - 1);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Answer for Recursion Question no 10 : Venkatesh Vemula");
        int n = 4, output;
        output = fact(n);
        System.out.println("factorial of 4  = " + output);
        System.out.println("infinity call ");
        System.out.println(inti_fact(n));
    }
}
