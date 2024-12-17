/*
 18. Write a Java program to copy a linked list to another linked list.
 */

import java.util.Collections;
import java.util.LinkedList;

public class Exercise18 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        LinkedList ll1 = new LinkedList<>();
        ll1.add("Bill");
        ll1.add("Larry");
        System.out.println(ll1);

        System.out.println("Copying/Cloning List2 into List1");

        ll1 = (LinkedList) ll.clone();
        System.out.println(ll);
    }
}
