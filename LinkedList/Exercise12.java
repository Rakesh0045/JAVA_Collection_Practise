/*
 12. Write a Java program to remove a specified element from a linked list.
 */

import java.util.LinkedList;

public class Exercise12 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Removing an element");
        ll.remove("Haku");
        System.out.println(ll);
    }
}
