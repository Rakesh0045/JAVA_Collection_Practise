/*
 1. Write a Java program to create a vector to store integer elements
 */

import java.util.Vector;

public class Exercise1 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        System.out.println(v);
    }
}