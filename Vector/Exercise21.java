/*
 21. Write a Java program to check whether a Vector collection is empty or not
 */

import java.util.Vector;

public class Exercise21 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Is Vector Object Empty : " + v.isEmpty());
        v.removeAllElements();
        System.out.println("Removed All Elements");
        System.out.println(v);
        System.out.println("Is Vector Object Empty : " + v.isEmpty());
    }
}
