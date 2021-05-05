/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExam_Question05;

/**
 *
 * @author Venkatesh Vemula
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Answer for Circle Question no 5 : Venkatesh Vemula ");
        ComparableCircle comp1 = new ComparableCircle(10);
        ComparableCircle comp2 = new ComparableCircle(20);
        ComparableCircle comp3 = new ComparableCircle(30);
        ComparableCircle comp5 = new ComparableCircle(40);
        ComparableCircle comp6 = new ComparableCircle(15);
        int result = comp2.compareTo(comp6);
        if (result == 1) {
            System.out.println(comp2.getArea() + " is greater than " + comp6.getArea());
        }
        if (result == -1) {
            System.out.println(comp2.getArea() + " is less than " + comp6.getArea());
        }
        if (result == 0) {
            System.out.println(comp2.getArea() + " is equal to " + comp6.getArea());
        }
    }
}
