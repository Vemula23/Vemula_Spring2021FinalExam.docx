/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinaExam_Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Venkatesh Vemula
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Employee Question no 12 : Venkatesh Vemula");
        ArrayList<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(11, "Venkatesh", 5000);
        Employee emp2 = new Employee(06, "Jack", 6000);
        Employee emp3 = new Employee(13, "Dainels", 4500);
        Employee emp4 = new Employee(02, "Ibrahim", 3500);
        Employee emp5 = new Employee(07, "Audithya", 4900);

        employees.add(emp1);employees.add(emp2);employees.add(emp3);employees.add(emp4);employees.add(emp5);
        System.out.println("**************");
        System.out.println("Original List");
        for (Employee s : employees) {
            System.out.println(s.toString());
        }
        Collections.sort(employees);
        System.out.println("******************");
        System.out.println("sorted by empId");
        for (Employee v : employees) {
            System.out.println(v.toString());
        }
       
        for (Employee vem : employees) {
            System.out.println(vem.toString());
        }
         System.out.println("***************");
        System.out.println("Sorted  By  empSalary");
        Collections.sort(employees,new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.valueOf(e1.getEmpSalary()).compareTo(e2.getEmpSalary());
            }
        });
      for (Employee vem : employees) {
            System.out.println(vem.toString());
        }
        System.out.println("***************");
        System.out.println("Sorted  By  empName");
       
          Collections.sort(employees,new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                 return e1.getEmpName().compareTo(e2.getEmpName());
            }
        });
           for (Employee vem : employees) {
            System.out.println(vem.toString());
        }
        
    }

}
