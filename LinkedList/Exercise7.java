/*
 7. Write a Java program to insert the specified element at the front of a linked list.
 */

import java.util.LinkedList;

public class Exercise7 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Adding an element at front of a linked list");

        ll.offerFirst("Larry");
        System.out.println(ll);
    }
}
