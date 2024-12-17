/*
 9. Write a Java program to remove a specified item from Vector collection
 */

import java.util.Vector;

public class Exercise9 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(10);
        v.addElement("Adam");
        v.addElement(30);
        v.addElement(40);
        System.out.println(v);

        System.out.println("Removing element Adam");
        v.remove("Adam");
        System.out.println(v);
    }
}
