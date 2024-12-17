/*
 15. Write a Java program to copy elements of Vector collection into an array
 */

import java.util.Vector;

public class Exercise15 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add(new String("Adam"));
        v.add("Billy");
        v.add(new StringBuilder("Java"));
        v.add(new Integer(10));
        System.out.println(v);

        System.out.println("Converting Vector object into an Array");

        Object[] arr = v.toArray();
        for (Object obj : arr) {
            System.out.println(String.valueOf(obj));
        }
    }
}
