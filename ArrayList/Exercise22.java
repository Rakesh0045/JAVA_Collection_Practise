/*
 22. Write a Java program to print all the elements of an ArrayList using the elements' position.
 */

import java.util.ArrayList;

public class Exercise22 {
    public static void main(String[] args) {

        ArrayList aa = new ArrayList<>();
        aa.add("Ramesh");
        aa.add("Suresh");
        aa.add("Kamlesh");
        aa.add("Samresh");

        System.out.println(aa);

        System.out.println("Printing all elements using elements position");

        int size = aa.size();

        for (int i = 0; i < size; i++) {

            System.out.println(aa.get(i));

            // String name = (String) aa.get(i);
            // System.out.println(name);
        }
    }
}
