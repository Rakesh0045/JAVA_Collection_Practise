/*
 14.Write a Java program to remove all elements from a linked list.
 */

import java.util.Collections;
import java.util.LinkedList;

public class Exercise14 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Removing all elements");
        ll.clear();
        System.out.println(ll);
    }
}
