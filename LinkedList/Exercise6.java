/*
 6. Write a Java program to insert elements into the linked list at the first and last positions.
 */

import java.util.LinkedList;

public class Exercise6 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Adding an element at first and last position");

        ll.addFirst("Larry");
        ll.addLast("Linus");
        System.out.println(ll);
    }
}
