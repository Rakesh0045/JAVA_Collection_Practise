/*
 25. Write a Java program to check if a linked list is empty or not.
 */

import java.util.LinkedList;

public class Exercise25 {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Is the LinkedList object empty: " + ll.isEmpty());
    }
}
