/*
 39. Write a Java program to Accessing elements in a Vector
 */

import java.util.Vector;

public class Exercise39 {
    public static void main(String[] args) {
        Vector v1 = new Vector<>();
        v1.add("Apple");
        v1.add("Banana");
        v1.add("Orange");
        v1.add("Cherry");
        v1.add("Mango");
        System.out.println(v1);

        System.out.println("Accessing element at index 2");
        System.out.println(v1.get(2));
    }
}
