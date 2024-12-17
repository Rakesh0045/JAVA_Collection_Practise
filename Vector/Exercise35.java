/*
 35. Write a Java program to sort the elements of a Vector collection
 */

import java.util.Collections;
import java.util.Vector;

public class Exercise35 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Sorting the Vector object");
        Collections.sort(v);
        System.out.println(v);
    }
}
