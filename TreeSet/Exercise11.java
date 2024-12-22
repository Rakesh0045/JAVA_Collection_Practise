/*
 11. Write a Java program to get the element in a tree set less than or equal to the given element.
 */

import java.util.NavigableSet;
import java.util.TreeSet;

public class Exercise11 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(7);
        ts.add(5);
        ts.add(1);
        ts.add(4);
        ts.add(9);
        ts.add(19);
        System.out.println(ts);

        System.out.println("Elements less than or equal to 7: " + ts.headSet(7, true));

        System.out.println("Element less than or equal to 15: " + ts.floor(15));
        System.out.println("Element less than or equal to 9: " + ts.floor(9));
    }
}
