/*
 13. Write a Java program to compare two array lists.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Exercise13 {
    public static void main(String[] args) {
        ArrayList<String> aa = new ArrayList<>();
        aa.add("Red");
        aa.add("Green");
        aa.add("Black");
        aa.add("White");
        aa.add("Pink");

        System.out.println(aa);

        ArrayList<String> aa1 = new ArrayList<>();
        aa1.add("Red");
        aa1.add("Green");
        aa1.add("Black");
        aa1.add("Pink");

        System.out.println(aa1);

        System.out.println("Comparing Elements of ArrayList1 and ArrayList2");
        ArrayList<String> aa2 = new ArrayList<>();

        for (String str : aa) {
            aa2.add(aa1.contains(str) ? "Yes" : "No");
        }

        System.out.println(aa2);
    }
}
