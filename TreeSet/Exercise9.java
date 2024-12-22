/*
 9. Write a Java program to find numbers less than 7 in a tree set.
 */

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Exercise9 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(7);
        ts.add(5);
        ts.add(1);
        ts.add(4);
        ts.add(9);
        ts.add(19);
        System.out.println(ts);

        NavigableSet lessThanSeven = ts.headSet(7, false);
        System.out.println("See the elements less than 7: " + lessThanSeven);
    }
}
