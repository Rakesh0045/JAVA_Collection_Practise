/*
 19. Write a Java program to get elements from Vector collection based on an index
 */

import java.util.Enumeration;
import java.util.Vector;

public class Exercise19 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Traversing Elements using index");

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

    }
}
