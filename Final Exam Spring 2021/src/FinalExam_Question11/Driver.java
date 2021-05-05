/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExam_Question11;

/**
 *
 * @author Venkatesh Vemula
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Venkatesh vemula ");
        System.out.println(" Solution for hash & equals method in question 11 ");
        IceCream i1 = new IceCream("Vanilla", "small");
        IceCream i2 = new IceCream("choclate", "medium");
        IceCream i3 = new IceCream(" bananna fruit mix ", "large");

        System.out.println("** implementation of Equals method is done ****");
        //here comparing the different IceCream class objects based upon their instance values.
        //The output will ne a True or False.
        //In equals method all the instance variables of one object withrespect to instance of another class,if both are equals then it returns true otherwise returns false.
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(i3));
        System.out.println(i2.equals(i3));

        System.out.println("** implementation of the == method is completed  ****");
        // here comapring different objects based upon the reference location.
        // == for any object it compares reference location.
        // If any two objects variable refers to same location then it return true otherwise false.
        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        System.out.println(i2 == i3);

        System.out.println("** Hash method is implemented ****");
        //Here Comparing the hashcode values of all variables 
        //Here i1.i3 object hash code values as same because hash code of a object on instance variable value where i1,i4 as same instance variable values
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        System.out.println(i3.hashCode());

        System.out.println("** instance objects of the t1 and t3 are compared by hashcode ****");
        // it should return true because i1,i3 has same instance variable values and hash code is generated based upon the them. so object hashcode should be same.
        System.out.println(i1.hashCode() == i3.hashCode());
    }
}
    

