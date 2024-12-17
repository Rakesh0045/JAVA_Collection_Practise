/*
 37. Write a Java program to get the subList from the Vector collection
 */

import java.util.Spliterator;
import java.util.Vector;

public class Exercise37 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Getting Sublist from index 1 to 4");
        System.out.println(v.subList(1, 4));
    }
}
