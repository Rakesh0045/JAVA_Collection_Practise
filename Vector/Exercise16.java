/*
 16. Write a Java program to get element from Vector collection at the specified index
 */

import java.util.Vector;

public class Exercise16 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        System.out.println(v);

        System.out.println("Element at index 2 : "+v.get(2));

    }   
}
