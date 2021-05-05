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
public class SteelBootle extends Bottle{
    public SteelBootle(String price, String color, double size) {
        super(price, color, size);
    }
    @Override
    public void weightOfBottle()
    {
        System.out.println("weight of steel bottle is 1000 gm");
    } 
    public void values() { 
        System.out.print("color of the bottle is : ");
        System.out.println(super.getColor());
    }
    public void price(){
        System.out.print("price of the bottle is : ");
        System.out.println(super.getPrice());  
    }  
    public void size(){
        System.out.print("size of the bottle is : ");
        System.out.println(super.getSize());
    }
}


