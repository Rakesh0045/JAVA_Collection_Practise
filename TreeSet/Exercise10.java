/*
 10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
 */

import java.util.NavigableSet;
import java.util.TreeSet;

public class Exercise10 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(7);
        ts.add(5);
        ts.add(1);
        ts.add(4);
        ts.add(9);
        ts.add(19);
        System.out.println(ts);

        NavigableSet moreThanSeven = ts.tailSet(7, false);
        System.out.println("See the elements greater than 7: " + moreThanSeven);

        System.out.println("Element greater than or equal to 13: " + ts.ceiling(13));
        System.out.println("Element greater than or equal to 1: " + ts.ceiling(1));
    }
}
