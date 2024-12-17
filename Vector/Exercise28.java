/*
 28. Write a Java program to remove an element from Vector collection based on the specified index
 */

import java.util.Vector;

public class Exercise28 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Removing Element at index 3");
        v.removeElementAt(3);
        System.out.println(v);
    }
}
