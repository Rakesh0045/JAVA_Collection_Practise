/*
 14. Write a Java program that swaps two elements in an array list.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Exercise14 {
    public static void main(String[] args) {

        ArrayList aa1 = new ArrayList<>();
        aa1.add(1);
        aa1.add(2);
        aa1.add(3);
        aa1.add(4);

        System.out.println(aa1);

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("\nEnter the numbers to be swapped from the ArrayList");
        System.out.print("\n1st number: ");
        int a = sc.nextInt();
        System.out.print("\n2nd number: ");
        int b = sc.nextInt();

        // #Approach-1

        // if (aa1.contains(a) && aa1.contains(b)) {
        // int index1 = aa1.indexOf(a);
        // int index2 = aa1.indexOf(b);

        // aa1.set(index1, b);
        // aa1.set(index2, a);
        // } else {
        // System.out.println("Elements enetered not found in the ArrayList");
        // }

        // System.out.println(aa1);

        // #Better Approach

        Collections.swap(aa1, aa1.indexOf(a), aa1.indexOf(b));
        System.out.println(aa1);

    }
}
