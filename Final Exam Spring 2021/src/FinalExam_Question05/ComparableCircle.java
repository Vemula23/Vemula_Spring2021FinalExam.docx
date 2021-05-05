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
public class ComparableCircle extends Circle implements Comparable<Circle> {

    public ComparableCircle(int area) {
        super(area);
    }

    void drawCircle() {
        System.out.println("Drawing Circle");
    }

    @Override
    public int compareTo(Circle v) {
        if (area == v.area) {
            return 0;
        } else if (area > v.area) {
            return -1;
        } else {
            return -1;
        }
    }

}
