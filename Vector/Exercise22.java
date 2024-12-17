/*
 22. Write a Java program to get the first element of Vector using the firstElement() method
 */

import java.util.Vector;

public class Exercise22 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("First Element of Vector : " + v.firstElement());

    }
}
