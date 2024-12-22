// WRITE A PROGRAM TO INSERT String OBJECTS INTO THE TreeSet WHERE ALL ELEMENTS SHOULD BE INSERTED IN REVERSE ALPHABETICAL ORDER

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Exercise17 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyComparator());
        ts.add("Adam");
        ts.add("Billy");
        ts.add("Charlie");
        ts.add("Daniel");
        ts.add("Ellie");

        System.out.println("Printing Elements in reverse alphabet order: " + ts);
    }
}

class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        return s2.compareTo(s1);
    }
}
