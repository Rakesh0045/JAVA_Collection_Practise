/*
 10. Write a Java program to get the value of a specified key in a map.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Exercise10 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);

        System.out.println("Value for key 5: " + map.get(5));
    }
}
