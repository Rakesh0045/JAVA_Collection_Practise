/*
 8. Write a Java program to insert the specified element at the end of a linked list
 */

import java.util.LinkedList;

public class Exercise8 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Adding an element at last of a linked list");

        ll.offerLast("Larry");
        System.out.println(ll);
    }
}
