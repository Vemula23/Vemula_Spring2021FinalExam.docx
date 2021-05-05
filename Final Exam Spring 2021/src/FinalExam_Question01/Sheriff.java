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
public class Sheriff extends Police{

    public Sheriff(String name, int height, int weight) {
        super(name, height, weight);
    }

    @Override
  public void uniformColor() {
        System.out.println("color of the uniform is Blue");
    }
  public void  name(){
      System.out.println(" name of the sheriff is : ");
      System.out.println(super.getName());  
  }
  public void height(){
      System.out.println(" height of the sheriff is : ");
      System.out.println(super.getHeight());
  }
  public void weight(){
      System.out.println(" weight of the sheriff is : ");
      System.out.println(super.getWeight());
  }   
}
