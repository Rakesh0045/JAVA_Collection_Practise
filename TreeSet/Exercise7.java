/*
 7. Write a Java program to get the number of elements in a tree set.
 */

import java.util.TreeSet;

public class Exercise7 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(67);
        ts.add(55);
        ts.add(18);
        ts.add(48);
        ts.add(1);

        System.out.println(ts);

        System.out.println("No. of elements : "+ts.size());
    }
}
