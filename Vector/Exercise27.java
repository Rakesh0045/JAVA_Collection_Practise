/*
 27. Write a Java program to remove the first occurrence of the specified element from Vector collection
 */

import java.util.Vector;

public class Exercise27 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Removing First Occurence of 10");
        v.removeElement(10);
        System.out.println(v);
    }
}
