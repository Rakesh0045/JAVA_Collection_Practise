/*
 11. Write a Java program to display elements and their positions in a linked list.
 */

import java.util.LinkedList;

public class Exercise11 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Displaying elements and their positions");
        int size = ll.size();
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + ll.get(i));
        }
    }
}
