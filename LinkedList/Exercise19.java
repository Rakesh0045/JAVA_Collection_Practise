/*
19. Write a Java program to remove and return the first element of a linked list.
 */

import java.util.LinkedList;

public class Exercise19 {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Removed Element : "+ll.pop());

        System.out.println(ll);

    }
}
