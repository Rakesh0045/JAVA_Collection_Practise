/*
 5. Write a Java program to get the first and last elements in a tree set.
 */

import java.util.TreeSet;

public class Exercise5 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(67);
        ts.add(55);
        ts.add(18);
        ts.add(48);
        ts.add(1);

        System.out.println(ts);

        System.out.println("First Element : " + ts.first());
        System.out.println("Last Element : " + ts.last());
    }
}
