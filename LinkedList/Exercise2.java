/*
 2. Write a Java program to iterate through all elements in a linked list.

 */

import java.util.LinkedList;

public class Exercise2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Iterating through all elements");

        // BETTER PRACTISE
        for (String name : ll) {
            System.out.println(name);
        }

        // 2nd Approach
        int size = ll.size();
        for (int i = 0; i < size; i++) {
            System.out.println(ll.get(i));
        }
    }
}
