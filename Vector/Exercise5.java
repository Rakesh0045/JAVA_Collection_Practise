/*
 5. Write a Java program to remove all elements of Vector collection
 */

import java.util.Vector;

public class Exercise5 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        System.out.println(v);
        System.out.println("Removing all elements");
        v.removeAll(v);
        System.out.println(v);
    }
}
