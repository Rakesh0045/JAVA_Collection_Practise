/*
 25. Write a Java program to remove all elements of Vector collection contained in the specified collection
 */

import java.util.Vector;

public class Exercise25 {
    public static void main(String[] args) {
        Vector v1 = new Vector<>();
        v1.add("Apple");
        v1.add("Banana");
        v1.add("Orange");
        v1.add("Cherry");
        v1.add("Mango");
        System.out.println(v1);

        Vector v2 = new Vector<>();
        v2.add("Papaya");
        v2.add("Apple");
        v2.add("Grapes");
        v2.add("Cherry");
        System.out.println(v2);

        System.out.println("Removing elements from v1 which are present in v2");
        v1.removeAll(v2);

        System.out.println(v1);
        System.out.println(v2);
    }
}
