/* 
1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
*/

import java.util.*;
import java.io.*;

public class Exercise1 {
    public static void main(String args[]) throws IOException {
        ArrayList aa = new ArrayList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nENTER TOTAL NO. OF COLORS TO BE ENTERED: ");
        int num = Integer.parseInt(br.readLine());
        int i = 0;
        do {
            System.out.print("\nENTER A COLOR: ");
            String color = br.readLine();
            aa.add(color);
            i++;
        } while (i < num);

        System.out.println("\nSEE THE ARRAYLIST OBJECT AT ONCE: ");
        System.out.println(aa);

        System.out.println("\nSEE THE ARRAYLIST OBJECT ONE BY ONE: ");
        int size = aa.size();
        for (i = 0; i < size; i++) {
            String color = (String) aa.get(i);
            System.out.println(color);
        }
    }
}