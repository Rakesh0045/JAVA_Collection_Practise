/*
 4. Write a Java program to iterate a linked list in reverse order.
 */

import java.util.LinkedList;
import java.util.ListIterator;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Iterating through all elements in reverse order");

        int size = ll.size();
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(ll.get(i));
        }

        // 2nd Approach

        System.out.println("Iterating through all elements in reverse order");

        Iterator itr = (Iterator) ll.descendingIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
