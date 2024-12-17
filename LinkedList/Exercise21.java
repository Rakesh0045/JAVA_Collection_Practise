/*
 21. Write a Java program to retrieve, but not remove, the last element of a linked list.
 */

import java.util.LinkedList;

public class Exercise21 {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Last Element : " + ll.peekLast());

        System.out.println(ll);

    }
}
