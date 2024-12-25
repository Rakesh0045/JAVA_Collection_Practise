/*
 6. Write a Java program to get a shallow copy of a HashMap instance
 */

import java.util.Collections;
import java.util.HashMap;

public class Exercise6 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);

        System.out.println("Creating Shallow copy of HashMap");
        HashMap<Integer, String> map1 = (HashMap<Integer, String>) map.clone();
        System.out.println(map1);
    }
}
