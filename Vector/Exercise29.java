/*
 29. Write a Java program to remove range of elements from Vector collection based on specified indices
 */

import java.util.Vector;
import java.util.*;

public class Exercise29 extends Vector {
    public static void main(String[] args) {
        Exercise29 v = new Exercise29();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        System.out.println(v);

        System.out.println("Removing Elements from index 2 to 5");
        v.removeRange(2, 5);
        System.out.println(v);
    }
}
