/*
 12. Write a Java program to extract a portion of an array list.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Exercise12 {
    public static void main(String[] args) {
        ArrayList aa = new ArrayList<>();
        aa.add("Abullah");
        aa.add(973);
        aa.add(new String("Java"));
        aa.add("Lila");
        aa.add(15 + 3);
        System.out.println(aa);

        System.out.print("Portion of the ArrayList: ");
        System.out.print(aa.subList(1, 4));
    }
}
