/*
 4. Write a Java program to count the items of a Vector collection
 */

import java.util.Vector;

public class Exercise4 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        System.out.println(v);
        System.out.println("No of items in Vector object : " + v.size());
    }
}
