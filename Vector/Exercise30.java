/*
 30. Write a Java program to remove elements from Vector collection based on a specified predicate/condition
 */

import java.util.Vector;

public class Exercise30 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(10);
        v.addElement(25);
        v.addElement(33);
        v.addElement(40);
        v.addElement(17);
        v.addElement(28);
        System.out.println(v);

        System.out.println("Removing Elements which are even");
        v.removeIf(val -> (val % 2 == 0));
        System.out.println(v);
    }
}
