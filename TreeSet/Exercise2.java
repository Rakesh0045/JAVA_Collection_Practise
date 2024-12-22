/*
 Traversing elements in descending order.
 */

import java.util.Iterator;
import java.util.TreeSet;

public class Exercise2 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add("Adam");
        ts.add("Billy");
        ts.add("Charlie");
        ts.add("Daniel");
        ts.add("Ellie");

        System.out.println(ts);

        System.out.println("\nIterating in descending order using descendingIterator()");
        Iterator itr = ts.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
