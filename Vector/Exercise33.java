/*
 33. Write a Java program to set an element at the specified index in Vector collection
 */

import java.util.Collections;
import java.util.Vector;

public class Exercise33 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Setting 99 at index 3");
        v.setElementAt(99, 3);
        System.out.println(v);
    }
}
