/*
 16. Write a Java program to shuffle elements in a linked list.
 */

import java.util.Collections;
import java.util.LinkedList;

public class Exercise16 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.add(25);
        ll.add(13);
        ll.add(134);
        ll.add(67);
        ll.add(28);
        System.out.println(ll);

        System.out.println("Shuffling elements");
        Collections.shuffle(ll);
        System.out.println(ll);
    }
}
