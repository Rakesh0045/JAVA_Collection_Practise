/*
 24. Write a Java program to compare two linked lists.
 */

import java.util.LinkedList;

public class Exercise24 {
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("Red");
        ll1.add("Green");
        ll1.add("Black");
        ll1.add("White");
        ll1.add("Pink");
        System.out.println(ll1);

        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("Red");
        ll2.add("Green");
        ll2.add("Black");
        ll2.add("Orange");
        System.out.println(ll2);

        System.out.println("Comparing two LinkedLists");

        LinkedList<String> ll3 = new LinkedList<>();

        for (String element : ll1) {
            ll3.add(ll2.contains(element) ? "Yes" : "No");
        }
        System.out.println(ll3);

    }
}
