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
public class Square extends GeometricObject implements Colorable{

    @Override
    public void area(double area) {
        System.out.println("area is  : "+area);
        
    }

    @Override
    public String howToColor(String color) {
        System.out.println("color : "+ color);
        return color;
    }   
}
