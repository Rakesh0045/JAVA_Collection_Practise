/*
 9. Write a Java program to insert some elements at the specified position into a linked list.
 */

import java.util.LinkedList;

public class Exercise9 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        LinkedList ll1 = new LinkedList<>();
        ll1.add("Bill");
        ll1.add("Larry");
        System.out.println("Adding elements at index 1");

        ll.addAll(1, ll1);
        System.out.println(ll);
    }
}
