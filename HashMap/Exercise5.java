/*
 5. Write a Java program to check whether a map contains key-value mappings (empty) or not
 */

import java.util.HashMap;

public class Exercise5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);

        System.out.println("Is the HashMap empty: " + map.isEmpty());
        map.clear();
        System.out.println(map);
        System.out.println("Is the HashMap empty: " + map.isEmpty());
    }
}
