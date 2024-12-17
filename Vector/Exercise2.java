/*
 2. Write a Java program to create a vector to store objects of a class
 */

import java.util.Vector;

public class Exercise2 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(new Integer(10));
        v.addElement(new String("String"));
        v.addElement(new StringBuilder("Adam"));
        v.addElement(new Exercise2());
        System.out.println(v);
    }
}
