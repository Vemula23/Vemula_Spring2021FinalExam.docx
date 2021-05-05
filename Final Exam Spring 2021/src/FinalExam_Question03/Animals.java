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
public abstract class Animals implements Mammal{
    
   public void eating(){
       System.out.println(" Animal Starts Eating ");
   }
   public void moving(){
       System.out.println(" Animal Starts Moving ");
   }
   public void sleeping(){
       System.out.println(" Animal Starts sleeping ");
   }
}
