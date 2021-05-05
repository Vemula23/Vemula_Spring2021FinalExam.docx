/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExam_Question02;

/**
 *
 * @author Venkatesh Vemula
 */
public class Tests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Answer for colorable interface : Venkatesh Vemula ");
        Square GMObjects = new Square();      
        int area[] = {12,32,56,7,9};
        String Colors[] =  {"orange", "Yellow", "Gold", "Brown", "White"};
        
        for (int i=0; i<area.length; i++){
            System.out.println("GMObjects of : "+i);
            GMObjects.area(area[i]);
            GMObjects.howToColor(Colors[i]);
            System.out.println();
        }
    }
    
}
