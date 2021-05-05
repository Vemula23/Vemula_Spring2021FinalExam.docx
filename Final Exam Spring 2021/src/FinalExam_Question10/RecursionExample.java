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
public class RecursionExample {
    static int fact( int a ) {
    if (a!= 0)  
    return a * fact(a-1); // recursive call
    else
    return 1;
    }
}

