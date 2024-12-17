/*
 8. Write a Java program to replace an item into Vector collection at the specified index
 */

import java.util.Vector;

public class Exercise8 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        System.out.println(v);

        System.out.println("Replacing 40 with 34 at index 3");
        v.set(3, 34);
        System.out.println(v);
    }
}
