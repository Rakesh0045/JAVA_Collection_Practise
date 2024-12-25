/*
 14. Write a Java program to how to use remove() method in HashMap
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Exercise14 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);

        System.out.println("Removing element Billy");
        map.remove(map.get("Billy"));
        System.out.println(map);
    }
}
