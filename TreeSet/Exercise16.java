/*
 Write a Java program to add non-common elements of one TreeSet into another TreeSet collection

 */

import java.util.TreeSet;

public class Exercise16 {
    public static void main(String args[]) {
        TreeSet<String> num1 = new TreeSet<String>();
        num1.add("Blue");
        num1.add("Yellow");
        num1.add("Red");
        num1.add("Green");
        num1.add("White");

        TreeSet<String> num2 = new TreeSet<String>();
        num2.add("Orange");
        num2.add("Yellow");
        num2.add("Green");
        num2.add("Pink");

        System.out.println("TreeSet 1 Elements : " + num1);
        System.out.println("TreeSet 2 Elements : " + num2);

        num1.addAll(num2);
        System.out.println("\nTreeSet 1 Elements : " + num1);
        System.out.println("TreeSet 2 Elements : " + num2);
    }
}
