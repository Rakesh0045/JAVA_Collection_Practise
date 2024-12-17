/*
 20. Write a Java program to get the Index of the last occurrence of the specified item in Vector collection
 */

import java.util.Vector;

public class Exercise20 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Last Occurence of 10 is at index : " + v.lastIndexOf(10));

    }
}
