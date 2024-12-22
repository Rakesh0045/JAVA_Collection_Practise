/*
 6. Write a Java program to clone a tree set list to another tree set.
 */

import java.util.TreeSet;

public class Exercise6 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(67);
        ts.add(55);
        ts.add(18);
        ts.add(48);
        ts.add(1);

        System.out.println(ts);

        System.out.println("Cloning the TreeSet object");
        TreeSet ts1 = (TreeSet)ts.clone();
        System.out.println(ts1);
    }
}
