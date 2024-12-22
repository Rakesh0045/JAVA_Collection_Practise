/*
 Remove the highest and lowest Value.
 */

import java.util.Iterator;
import java.util.TreeSet;

public class Exercise3 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(67);
        ts.add(55);
        ts.add(18);
        ts.add(48);
        ts.add(1);

        System.out.println(ts);

        System.out.println("\nRemoving highest and lowest value");
        System.out.println(
                "\nAs TreeSet holds element in natural sorting order. First element will be lowest and Last element will be highest");
        ts.pollFirst();
        ts.pollLast();

        System.out.println(ts);
    }
}
