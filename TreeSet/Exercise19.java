// WRITE A PROGRAM TO INSERT String AND StringBuffer OBJECTS TO TREESET WHERE SORTING ORDER IS INCREASING LENGTH. (If two objects have same length, then consider their alphabetical order

import java.util.Comparator;
import java.util.TreeSet;

public class Exercise19 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>(new MyComparator());
        ts.add("Eren");
        ts.add(new StringBuffer("Gregson"));
        ts.add("Jefferson");
        ts.add(new StringBuffer("Erwin"));
        ts.add("Hange");
        ts.add(new StringBuffer("Kiki"));

        System.out.println(
                "TreeSet does not allow Heterogeneous elements. But we are adding String and StringBuffer objects into the TreeSet");
        System.out.println("See Elements in increasing order of length: " + ts);
    }
}

class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        int size1 = s1.length();
        String s2 = obj2.toString();
        int size2 = s2.length();

        if (size1 > size2) {
            return 1;
        } else if (size1 < size2) {
            return -1;
        } else {
            return s1.compareTo(s2);
        }
    }
}
