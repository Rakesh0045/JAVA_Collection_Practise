/*
 17. Write a Java program to empty an array list.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Exercise17 {
    public static void main(String[] args) {

        ArrayList aa1 = new ArrayList<>();
        aa1.add(1);
        aa1.add(2);
        aa1.add(3);
        aa1.add(4);

        System.out.println(aa1);

        aa1.removeAll(aa1);
        System.out.println(aa1);
    }
}
