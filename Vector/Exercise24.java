/*
 24. Write a Java program to iterate Vector collection using the iterator() method
 */

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Exercise24 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Traversing Elements using Iterator cursor");

        Iterator itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
