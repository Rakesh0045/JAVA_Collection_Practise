/*
 10. Write a Java program to shuffle elements in an array list.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Exercise10 {
    public static void main(String[] args) {
        ArrayList aa = new ArrayList<>();
        aa.add("Green");
        aa.add("Blue");
        aa.add("Red");
        aa.add("Black");

        System.out.println("Before Shuffling: " + aa);

        Collections.shuffle(aa);

        System.out.println("After Shuffling: " + aa);
    }
}
