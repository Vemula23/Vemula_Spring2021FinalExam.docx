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
public class BottleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println(" Venkatesh Vemula");
      System.out.println("Answer for Bottle Abstract in question no 1 : ");
      SteelBootle s = new SteelBootle("100", "Green", 1.5);
      s.weightOfBottle();
      System.out.println("*****************");
      s.values();
        System.out.println("*****************");
      s.price();
        System.out.println("*******************");
      s.size();

    }
    
}
