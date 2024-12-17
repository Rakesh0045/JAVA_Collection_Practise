/*
 17. Write a Java program to join two linked lists.
 */

import java.util.LinkedList;

public class Exercise17 {

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
        System.out.println(ll1);

        System.out.println("Joining 2 LinkedLists");

        ll.addAll(ll1);
        System.out.println(ll);
    }
}
