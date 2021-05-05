/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExam_Question09;

/**
 *
 * @author S542404
 */
public class ThrowsDriver {
int division(int a, int b) throws ArithmeticException{  
	int t = a/b;
	return t;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Throws Question : Venkatesh Vemula");
        ThrowsDriver vem = new ThrowsDriver();
	try{
	   System.out.println(vem.division(22, 0));  
	}
	catch(ArithmeticException e){
	   System.out.println("You cannot divide number by zero");
	}
    }
    
}
