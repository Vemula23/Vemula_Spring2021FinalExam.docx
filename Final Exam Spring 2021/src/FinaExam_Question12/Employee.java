/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinaExam_Question12;

/**
 *
 * @author Venkatesh Vemula
 */
public class Employee implements Comparable<Employee> {

    private int empId;
    private String empName;
    private int empSalary;

    public Employee(int empId, String empName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId = " + empId + ", empName = " + empName + ", empSalary = " + empSalary + '}';
    }

    @Override
    public int compareTo(Employee emp) {
        if (empId == emp.empId) {
            return 0;
        } else if (empId > emp.empId) {
            return 1;
        } else {
            return -1;
        }
    }

}
