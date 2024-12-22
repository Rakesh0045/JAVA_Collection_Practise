/*
 8. Write a Java program to compare two tree sets.
 */

import java.util.TreeSet;

public class Exercise8 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(67);
        ts.add(55);
        ts.add(18);
        ts.add(48);
        ts.add(1);

        System.out.println("TreeSet 1: " + ts);

        TreeSet ts1 = new TreeSet<>();
        ts1.add(95);
        ts1.add(18);
        ts1.add(13);
        ts1.add(55);
        ts1.add(69);

        System.out.println("TreeSet 2: " + ts1);

        System.out.println("Comparing both TreeSet objects");

        for (Object object : ts) {
            System.out.println(ts1.contains(object) ? "Yes" : "No");
        }
    }
}
