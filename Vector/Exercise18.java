/*
 18. Write a Java program to get the enumeration of the values present in the Vector
 */

import java.util.Enumeration;
import java.util.Vector;

public class Exercise18 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Traversing Elements using Enumeration cursor");

        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }
}
