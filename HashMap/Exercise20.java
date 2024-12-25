/*
 20. Write a Java program to get the size of the HashMap collection
 */

import java.util.Collection;
import java.util.HashMap;

public class Exercise20 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);

        System.out.println("Size of HashMap: " + map.size());
    }
}
