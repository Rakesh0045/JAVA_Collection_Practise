import java.util.*;

class Exercise4 {
    public static void main(String args[]) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("Initial Set: " + set);

        System.out.println("Reverse Set: " + set.descendingSet());

        System.out.println("Head Set(inclusive: true) : " + set.headSet("C", true));
        // It returns elements > or = (as inclusive is true) to the specified element
        // "C"

        System.out.println("Head Set(inclusive: false) : " + set.headSet("C", false));
        // It returns elements > (as inclusive is false) to the specified element "C"

        System.out.println("Head Set(inclusive: Not specified) : " + set.headSet("C", false));
        // It returns elements > (as inclusive is not specified) to the specified
        // element "C".
        // It is a method of SortedSet

        System.out.println("SubSet(inclusive: false(A) true(E)) : " + set.subSet("A", false, "E", true));

        System.out.println("SubSet(inclusive: true(A) true(E)) : " + set.subSet("A", true, "E", true));

        System.out.println("SubSet(inclusive: true(A) false(E)) : " + set.subSet("A", true, "E", false));

        System.out.println("SubSet(inclusive: false(A) false(E)) : " + set.subSet("A", false, "E", false));

        System.out.println("SubSet(inclusive: Not specified) : " + set.subSet("A", "E"));
        // It is a method of SortedSet

        System.out.println("TailSet(inclusive: false) : " + set.tailSet("C", false));

        System.out.println("TailSet(inclusive: true) : " + set.tailSet("C", true));

        System.out.println("TailSet(inclusive: Not Specified) : " + set.tailSet("C"));
        // It is a method of SortedSet
    }
}
