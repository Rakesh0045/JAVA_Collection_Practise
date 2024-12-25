/*
 17. Write a Java program to create a HashMap to store Key/Value pair
 */

import java.util.HashMap;

public class Exercise17 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);
    }
}
