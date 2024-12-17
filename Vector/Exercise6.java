/*
 6. Write a Java program to create a clone of a Vector collection
 */

import java.util.Vector;

public class Exercise6 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        System.out.println(v);
        System.out.println("Cloning Vector Object");

        Vector<Integer> v1 = (Vector) v.clone();
        System.out.println("Cloned Object : " + v1);

    }
}
