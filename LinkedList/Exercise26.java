/*
 26. Write a Java program to replace an element in a linked list.
 */

import java.util.LinkedList;

public class Exercise26 {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Replacing Element at index 1 with Adam");
        ll.set(1, "Adam");
        System.out.println(ll);
    }
}
