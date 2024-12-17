/*
 8. Write a Java program to sort a given array list.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Exercise8 {
    public static void main(String[] args) {
        ArrayList aa = new ArrayList<>();
        aa.add("Green");
        aa.add("Blue");
        aa.add("Red");
        aa.add("Black");

        System.out.println(aa);

        Collections.sort(aa);

        System.out.println(aa);

    }
}
