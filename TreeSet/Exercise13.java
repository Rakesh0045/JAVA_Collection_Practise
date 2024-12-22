/*
 13. Write a Java program to get an element in a tree set that has a lower value than the given element.
 */

import java.util.TreeSet;

public class Exercise13 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(7);
        ts.add(5);
        ts.add(1);
        ts.add(4);
        ts.add(9);
        ts.add(19);
        System.out.println(ts);

        System.out.println("Element Strictly less than 15: " + ts.lower(15));
        System.out.println("Element Strictly less than 9: " + ts.lower(9));
    }
}
