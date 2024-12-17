/*
 3. Write a Java program to insert an element into the array list at the first position.
 */

import java.util.ArrayList;

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList aa = new ArrayList<>();
        aa.add("Hari");
        aa.add("Mahesh");
        aa.add(0, "Ganesh");
        System.out.println(aa);
    }
}
