/*
 4. Write a Java program to remove all the mappings from a map
 */

import java.util.HashMap;

public class Exercise4 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);

        System.out.println("Removing all the mappings");
        map.clear();
        System.out.println(map);
    }
}
