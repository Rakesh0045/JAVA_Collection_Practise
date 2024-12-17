/*
 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
 */

import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise3 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Iterating through all elements starting from index 1");

        int size = ll.size();
        for (int i = 1; i < size; i++) {
            System.out.println(ll.get(i));
        }

        // 2nd Approach
        ListIterator ltr = ll.listIterator(1);

        while (ltr.hasNext()) {
            System.out.println(ltr.next());
        }
    }
}
