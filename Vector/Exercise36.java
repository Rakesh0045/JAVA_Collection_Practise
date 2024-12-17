/*
 36. Write a Java program to traverse the Vector collection using spliterator() method
 */

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Vector;

public class Exercise36 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Traversing using spliterator()");
        Spliterator itr = v.spliterator();
        itr.forEachRemaining((element) -> System.out.println(element));
    }

}
