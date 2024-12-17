/*
 7. Write a Java program to insert an item into Vector collection at the specified index
 */

import java.util.Vector;

public class Exercise7 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        System.out.println(v);

        System.out.println("Inserting 50 at index 3");
        v.add(3, 50);
        System.out.println(v);
    }
}
