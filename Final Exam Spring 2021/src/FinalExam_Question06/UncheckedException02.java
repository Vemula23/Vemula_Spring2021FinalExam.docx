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
public class UncheckedException02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Venkatesh Vemula ");
        System.out.println(" Answer for uncheckedException i nQuestion in 06 ");
        
        int arr[] = {11,22,33,44,55,66};
        /* My array has only 6 elements but we are trying to 
         * display the value of 10th element. It should throw
	 * ArrayIndexOutOfBoundsException
         */
        System.out.println(arr[9]);
    }
    
}
