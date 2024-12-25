/*
 2. Write a Java program to count the number of key-value (size) mappings in a map
 */

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);
        System.out.println("No. of key-value mappings: " + map.size());
    }
}
