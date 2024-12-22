/*
 12. Write a Java program to get the element in a tree set strictly greater than the given element.
 */

import java.util.NavigableSet;
import java.util.TreeSet;

public class Exercise12 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(7);
        ts.add(5);
        ts.add(1);
        ts.add(4);
        ts.add(9);
        ts.add(19);
        System.out.println(ts);

        System.out.println("Element Strictly greater than 13: " + ts.higher(13));
        System.out.println("Element Strictly greater than 1: " + ts.higher(1));
    }
}
