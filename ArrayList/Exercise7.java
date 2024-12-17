/*
 7. Write a Java program to search for an element in an array list.
 */

import java.util.ArrayList;

public class Exercise7 {
    public static void main(String[] args) {
        ArrayList aa = new ArrayList<>();
        aa.add("Green");
        aa.add("Blue");
        aa.add("Red");
        aa.add("Black");

        System.out.println(aa);

        // Searching for Black
        if (aa.contains("Black")) {
            System.out.println("Black element is found");
        } else {
            System.out.println("Black element is not found");
        }

    }
}
