/*
 23. Write a Java program to convert a linked list to an array list.
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Exercise23 {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList();
        ll.add("Ashitaka");
        ll.add("Haku");
        ll.add("Totoro");
        ll.add("Sophie");
        System.out.println(ll);

        System.out.println("Converting LinkedList into ArrayList");

        // Approach - 1
        ArrayList aa = new ArrayList<>();
        aa.addAll(ll);
        System.out.println(aa);

        // Approach - 2
        ArrayList al = new ArrayList<>(ll);
        System.out.println(al);
    }
}
