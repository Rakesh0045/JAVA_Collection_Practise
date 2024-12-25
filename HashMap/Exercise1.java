/*
 1. Write a Java program to associate the specified value with the specified key in a HashMap
 */

import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);
        System.out.println("Iterating using foreach loop");
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}