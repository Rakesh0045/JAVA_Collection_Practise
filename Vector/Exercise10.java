/*
 10. Write a Java program to remove an item from Vector collection at the specified index
 */

import java.util.Vector;

public class Exercise10 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        System.out.println(v);

        System.out.println("Removing element at index 2");
        v.remove(2);
        System.out.println(v);
    }
}
