/*
 34. Write a Java program to change the size of a Vector collection
 */

import java.util.Vector;

public class Exercise34 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Size of Vector Object : " + v.size());
        v.setSize(9);
        System.out.println("Increased Size to 9");
        System.out.println("New Size : " + v.size());
        System.out.println(v);
    }
}
