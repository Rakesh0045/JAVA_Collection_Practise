/*
 26. Write a Java program to remove all elements of Vector collection using removeAllElements() method
 */

import java.util.Iterator;
import java.util.Vector;

public class Exercise26 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Removing all Elements");
        v.removeAllElements();
        System.out.println(v);
    }
}
