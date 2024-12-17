/*
 5. Write a Java program to update an arraylist element by the given element.
 */

import java.util.ArrayList;

public class Exercise5 {
    public static void main(String[] args) {
        ArrayList aa = new ArrayList<>();
        aa.add("Green");
        aa.add("Blue");
        aa.add("Red");
        aa.add("Black");

        System.out.println(aa);

        // Replacing Blue with Yellow

        aa.set(aa.indexOf("Blue"), "Yellow");

        System.out.println(aa);
    }
}
