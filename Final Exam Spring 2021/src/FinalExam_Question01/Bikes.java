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
public class Bikes implements Vehicles{
         int currentSpeed;
    int gearNumber;
      
   
    @Override
    public void GearNo(int newGear){          
        gearNumber = newGear;
    }
      
  
    @Override
    public void IncreaseSpeed(int increment){          
       currentSpeed = currentSpeed + increment;
    }
      
    
    @Override
    public void applyBrakes(int decrement){
        currentSpeed = currentSpeed - decrement;
    }
      
    public void printStates() {
         System.out.println("CurrentSpeed: " + currentSpeed
             + " GearNumber: " + gearNumber);
    }

}


