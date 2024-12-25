/*
 8. Write a Java program to test if a map contains a mapping for the specified value
 */

import java.util.HashMap;
import java.util.Map;

public class Exercise8 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);

        System.out.println("Checking if HashMap contains value Billy");
        System.out.println(
                map.containsValue("Billy") ? "Yes! Value exists" : "Value does not exist");

        System.out.println("Checking if HashMap contains value Adam");
        System.out.println(
                map.containsValue("Adam") ? "Yes! Value exists" : "Value does not exist");
    }
}
