/*
 15. Write a Java program that swaps two elements in a linked list.
 */

import java.util.Collections;
import java.util.LinkedList;

public class Exercise15 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.add(25);
        ll.add(13);
        ll.add(134);
        ll.add(67);
        ll.add(28);
        System.out.println(ll);

        System.out.println("Swapping 13 and 67");

        int index1 = ll.indexOf(13);
        int index2 = ll.indexOf(67);

        ll.set(index1, 67);
        ll.set(index2, 13);
        System.out.println(ll);

        System.out.println("Swapping 25 and 134");
        Collections.swap(ll, ll.indexOf(25), ll.indexOf(134));
        System.out.println(ll);
    }
}
