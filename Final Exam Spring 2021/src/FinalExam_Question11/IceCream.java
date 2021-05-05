/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExam_Question11;

import java.util.Objects;

/**
 *
 * @author Venkatesh Vemula
 */
public class IceCream {
    private String flavor;
    private String size;

    public IceCream(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "IceCream{" + "flavor=" + flavor + ", size=" + size + '}';
    }

    @Override
    public int hashCode() {
        // this method return hascode value  of a class based upon the instance variables value.
        //this method is also used to compare different object of same class type based upon their instance variable value
        // the hascode value of two class will only be equal if all instance variable values of one class is equal to all th instance variable values  of comparing object. 
        int hash = 3;
        //Because model attribyte is string it generates a hashcode to it and add to hash value.
        hash = 67 * hash + Objects.hashCode(this.flavor);
        hash = 67 * hash + Objects.hashCode(this.size);
        //after hash value of complete class.
        return hash;
    }

    @Override
    //Here I have declared equals method which is used to compares parameter passed object with calling object and compares based upon all the instance variable of classes .
    //since Object obj is super class for all the classes we can declare it in parameter where passed instance implicity converted Object type
    //This method return boolean value true  if every instance attribute value are equal in both the instances.
    public boolean equals(Object obj) {
        // checking if both the object references are 
        // referring to the same object.
        if (this == obj) {
            return true;
        }
        // it checks if the argument is of the 
        // type IceCream by comparing the classes 
        // of the passed argument and this object.
        if (obj == null) {
            return false;
        }
        //comparing class cast if both the class class cast is different there we can also say both the classes are different so it return false
        if (getClass() != obj.getClass()) {
            return false;
        }
         //converting obj variable to Student class which is example os down casting
        final IceCream other = (IceCream) obj;
         //comparing first instance attribute id of both the objects if not equal it directly return false
        if (!Objects.equals(this.flavor, other.flavor)) {
            return false;
        }
         //comparing second instance attribute name of both the objects if not equal it directly return false.
        if (!Objects.equals(this.size, other.size)) {
            return false;
        }
         //this stage reacher only after all the instance variable are equals .so it returns true 
        return true;
    } 
}
