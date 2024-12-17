/*
 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
 */

import java.util.ArrayList;

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList aa = new ArrayList<>();
        aa.add("Abhinav");
        aa.add(973);
        aa.add(new String("Java"));
        aa.add(new Exercise4());
        aa.add("Suresh");

        System.out.println(aa.get(0));
        System.out.println(aa.get(aa.size() - 1));
    }
}
