/*
 20. Write a Java program to retrieve, but not remove, the first element of a linked list.
 */

import java.util.LinkedList;

public class Exercise20 {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("First Element : "+ll.peekFirst());

        System.out.println(ll);

    }
}
