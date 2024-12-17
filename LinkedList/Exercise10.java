/*
 10. Write a Java program to get the first and last occurrence of elements in a linked list.
 */

import java.util.LinkedList;

public class Exercise10 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("First Occurence: " + ll.getFirst());
        System.out.println("Last Occurence: " + ll.getLast());
    }
}
