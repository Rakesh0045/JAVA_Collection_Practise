/*
 11. Write a Java program to reverse elements in an array list.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Exercise11 {
    public static void main(String[] args) {
        ArrayList aa = new ArrayList<>();
        aa.add("Abullah");
        aa.add(973);
        aa.add(new String("Java"));
        aa.add("Lila");
        aa.add(15 + 3);
        System.out.println(aa);
        Collections.reverse(aa);
        System.out.println("After Reversing Elements: " + aa);
    }
}
