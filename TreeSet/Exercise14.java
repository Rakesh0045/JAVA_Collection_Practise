/*
 14. Write a Java program to retrieve and remove the first and last element of a tree set.
 */

import java.util.TreeSet;

public class Exercise14 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(7);
        ts.add(5);
        ts.add(1);
        ts.add(4);
        ts.add(9);
        ts.add(19);
        System.out.println(ts);

        System.out.println("Retrieving and Removing First Element from TreeSet: " + ts.pollFirst());
        System.out.println("Retrieving and Removing Last Element from TreeSet: " + ts.pollLast());
        System.out.println(ts);
    }
}
