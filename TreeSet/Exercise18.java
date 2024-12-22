// WRITE A PROGRAM TO INSERT StringBUffer OBJECTS INTO THE TreeSet WHERE ALL ELEMENTS SHOULD BE INSERTED IN ALPHABETICAL ORDER

import java.util.TreeSet;
import java.util.*;

public class Exercise18 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>(new MyComparator());
        ts.add(new StringBuffer("Eren"));
        ts.add(new StringBuffer("Gregson"));
        ts.add(new StringBuffer("Jefferson"));
        ts.add(new StringBuffer("Erwin"));
        ts.add(new StringBuffer("Hange"));
        ts.add(new StringBuffer("Kiki"));

        System.out.println("As StringBuffer does not implement Comparable interface, we are bound to use Comparator");
        System.out.println("See Elements in ascending order: " + ts);
    }
}

class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        return s1.compareTo(s2);
    }
}
