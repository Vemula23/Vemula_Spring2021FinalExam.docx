/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExam_Question09;

/**
 *
 * @author Venkatesh Vemula
 */
public class Throw {
   public void checkTime(double time){  
	if(time > 11.59)  
	   throw new ArithmeticException("Not eligilble for submission");  
	else  
	   System.out.println("Submission Accepted");  
   }  
}
