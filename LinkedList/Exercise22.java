/*
 22. Write a Java program to check if a particular element exists in a linked list.
 */

import java.util.LinkedList;

public class Exercise22 {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println(ll.contains("Adam") ? "Object Exists" : "Object does not exists"); 

    }
}
