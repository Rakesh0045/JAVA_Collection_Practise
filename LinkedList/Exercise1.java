/*
 1. Write a Java program to append the specified element to the end of a linked list.
 */

import java.util.LinkedList;

public class Exercise1 {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Adding an element at end");
        ll.addLast("Jefferson Hope");

        System.out.println(ll);
    }
}