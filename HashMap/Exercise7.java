/*
 7. Write a Java program to test if a map contains a mapping for the specified key
 */

import java.util.HashMap;

public class Exercise7 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);

        System.out.println("Checking if HashMap contains key 4");
        System.out.println(
                map.containsKey(4) ? "Yes! Key exists and Value for key is: " + map.get(4) : "Key does not exists");

        System.out.println("Checking if HashMap contains key 7");
        System.out.println(
                map.containsKey(7) ? "Yes!Key exists and Value for key is: " + map.get(7) : "Key does not exists");
    }
}
