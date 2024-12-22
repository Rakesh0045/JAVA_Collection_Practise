/*
 Write a Java program to access elements from TreeSet Collection using spliterator() method
 */

import java.util.Spliterator;
import java.util.TreeSet;

public class Exercise15 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(7);
        ts.add(5);
        ts.add(1);
        ts.add(4);
        ts.add(9);
        ts.add(19);
        System.out.println(ts);

        System.out.println("Iterating using Spliterator");
        Spliterator s = ts.spliterator();
        s.forEachRemaining(System.out::println);
    }
}
