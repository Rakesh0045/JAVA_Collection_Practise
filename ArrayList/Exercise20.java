/*
 20. Write a Java program to increase an array list size.
 */

import java.util.ArrayList;

public class Exercise20 {
    public static void main(String[] args) {
        ArrayList aa = new ArrayList<>(3);
        aa.add("Red");
        aa.add("Blue");
        aa.add("Green");

        System.out.println(aa);
        System.out.println(
                "Now ArrayList object is fully occupied. We want to insert 3 more elements. So we increase capacity to 6");

        aa.ensureCapacity(6);

        aa.add("Violet");
        aa.add("Black");
        aa.add("Orange");

        System.out.println(aa);

    }
}
