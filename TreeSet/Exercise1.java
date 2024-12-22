/*
 Simple example of Java TreeSet.
 */

import java.util.Iterator;
import java.util.TreeSet;

public class Exercise1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add("Adam");
        ts.add("Billy");
        ts.add("Charlie");
        ts.add("Daniel");
        ts.add("Ellie");
        // ts.add(10); ClassCastException -> TreeSet object can not hold heterogeneous
        // element
        // ts.add(null); NullPointerException -> TreeSet object can not hold null
        // element

        System.out.println(ts);

        System.out.println("\nIterating using Iterator cursor");
        Iterator itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nIterating using foreach loop");
        for (Object object : ts) {
            System.out.println(object);
        }
    }
}