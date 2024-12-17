/*
 16. Write a Java program to clone an array list to another array list.
 */

import java.util.ArrayList;

public class Exercise16 {
    public static void main(String[] args) {
        ArrayList aa1 = new ArrayList<>();
        aa1.add(1);
        aa1.add(2);
        aa1.add(3);
        aa1.add(4);

        System.out.println(aa1);

        ArrayList aa2 = (ArrayList) aa1.clone();
        System.out.println(aa2);
    }
}
