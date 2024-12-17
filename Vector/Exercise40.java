/*
 40. Write a Java program to Iterating over a Vector using an enhanced for loop
 */

import java.util.Vector;

public class Exercise40 {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();
        v1.add("Apple");
        v1.add("Banana");
        v1.add("Orange");
        v1.add("Cherry");
        v1.add("Mango");
        System.out.println(v1);

        System.out.println("Iterating using enhanced for loop/foreach loop");
        for (String element : v1) {
            System.out.println(element);
        }
    }
}
