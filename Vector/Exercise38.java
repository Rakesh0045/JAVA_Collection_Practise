/*
 38. Write a Java program to convert a Vector collection into an Object array
 */

import java.util.Vector;

public class Exercise38 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Converting Vector collection into an Object arraya and retrieving the elements");

        Object[] arr = v.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }
    }
}
