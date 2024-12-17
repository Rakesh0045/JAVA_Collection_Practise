/*
 23. Write a Java program to get the last element of Vector using the lastElement() method
 */

import java.util.Vector;

public class Exercise23 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Last Element of Vector : " + v.lastElement());

    }
}
