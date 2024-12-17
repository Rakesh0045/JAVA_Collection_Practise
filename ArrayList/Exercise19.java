/*
 19. Write a Java program for trimming the capacity of an array list.
 */

import java.util.ArrayList;

public class Exercise19 {
    public static void main(String[] args) {

        ArrayList aa = new ArrayList<>();
        aa.add("Ramesh");
        aa.add("Suresh");
        aa.add("Kamlesh");
        aa.add("Samresh");

        System.out.println(aa);

        System.out.println("Trimming the ArrayList object from initial capacity(10) to current capacity(4)");

        aa.trimToSize();

        System.out.println(aa);
    }
}