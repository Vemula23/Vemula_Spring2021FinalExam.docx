/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExam_Question10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Venkatesh Vemula 
 */
public class SearchDriver {
    
  public static boolean searchRecursive(ArrayList al,int i,int ele){
      if(i ==-1)
            return false;  
        else if((int)al.get(i)== ele)
            return true;
        else 
            return searchRecursive(al,i-1,ele);         
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> elements = new ArrayList<>();
    elements.add(1);
    elements.add(5);
    elements.add(3);
    elements.add(2);
    elements.add(10);
    elements.add(20);
    elements.add(13);
    System.out.println(" Answer for Search Element : Venkatesh Vemula ");
    System.out.print(" Enter a number for serching list : ");
    Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
    if(searchRecursive(elements, elements.size()-1,a))
            System.out.println(" Element found in list ");
    else
        System.out.println(" Element not found in list ");
    }
     
}
