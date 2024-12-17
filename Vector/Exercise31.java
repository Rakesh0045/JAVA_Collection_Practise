/*
 31. Write a Java program to replace a specified element at all places with another element in Vector collection
 */

import java.util.Collections;
import java.util.Vector;

public class Exercise31 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Replacing all the 10 with 99");
        Collections.replaceAll(v, 10, 99);
        System.out.println(v);
    }
}
