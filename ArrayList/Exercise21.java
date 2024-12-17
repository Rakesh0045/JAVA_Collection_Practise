/*
 21. Write a Java program to replace the second element of an ArrayList with the specified element.
 */

import java.util.ArrayList;

public class Exercise21 {
    public static void main(String[] args) {

        ArrayList aa = new ArrayList<>();
        aa.add("Ramesh");
        aa.add("Suresh");
        aa.add("Kamlesh");
        aa.add("Samresh");

        System.out.println(aa);

        System.out.println("Replacing 2nd element");

        aa.set(1, "Rakesh");

        System.out.println(aa);
    }
}
