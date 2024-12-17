/*
 12. Write a Java program to add elements of a vector to other vector collection at the specified position
 */

import java.util.Vector;

public class Exercise12 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        System.out.println(v);

        Vector v1 = new Vector<>();
        v1.addElement("Adam");
        v1.addElement("Bill");
        v1.addElement("Charlie");
        System.out.println(v1);

        System.out.println("Adding Vector2 into Vector1 at position 1");
        v.addAll(1, v1);
        System.out.println(v);
    }
}
