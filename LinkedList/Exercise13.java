/*
 13. Write a Java program to remove the first and last elements from a linked list.
 */

import java.util.LinkedList;

public class Exercise13 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Removing First and Last element");
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
