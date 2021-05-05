/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExam_Question06;

/**
 *
 * @author Venkatesh Vemula
 */
public class UncheckedException01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question unchecked Exception : Venkatesh Vemula");    
    int num11 = 20 ;
	int num22 = 0;
	/*Since I'm dividing an integer with 0
	 * it should throw ArithmeticException
         */
	int result = num11/num22;
	System.out.println(result);
    }
}
