/*
 6. Write a Java program to remove the third element from an array list.
 */

import java.util.ArrayList;

public class Exercise6 {
    public static void main(String[] args) {
        ArrayList aa = new ArrayList<>();
        aa.add("Green");
        aa.add("Blue");
        aa.add("Red");
        aa.add("Black");

        System.out.println(aa);

        // Removing 3rd element
        aa.remove(2);

        System.out.println(aa);
    }
}
