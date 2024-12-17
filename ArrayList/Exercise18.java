/*
 18. Write a Java program to test whether an array list is empty or not.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Exercise18 {
    public static void main(String[] args) {

        ArrayList aa1 = new ArrayList<>();
        aa1.add(1);
        aa1.add(2);
        aa1.add(3);
        aa1.add(4);

        System.out.println(aa1);

        System.out.println(aa1.isEmpty());

        aa1.removeAll(aa1);
        System.out.println(aa1);

        System.out.println(aa1.isEmpty());
    }
}
