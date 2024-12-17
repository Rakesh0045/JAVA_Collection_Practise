/*
 9. Write a Java program to copy one array list into another.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Exercise9 {
    public static void main(String[] args) {
        ArrayList aa = new ArrayList<>();
        aa.add("Green");
        aa.add("Blue");
        aa.add("Red");
        aa.add("Black");

        System.out.println(aa);

        ArrayList aa1 = new ArrayList<>();
        aa1.add(1);
        aa1.add(2);
        aa1.add(3);
        aa1.add(4);

        System.out.println(aa1);

        // copying aa1 into aa
        Collections.copy(aa, aa1);

        System.out.println(aa);
    }
}
