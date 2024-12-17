/*
 5. Write a Java program to insert the specified element at the specified position in the linked list.
 */

import java.util.LinkedList;

public class Exercise5 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Adding an element at specified position - index 3");

        ll.add(3, "Bill");
        System.out.println(ll);
    }
}
