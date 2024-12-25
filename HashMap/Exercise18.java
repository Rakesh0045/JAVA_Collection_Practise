/*
 18. Write a Java program to get keys from a HashMap collection
 */

import java.util.HashMap;
import java.util.Set;

public class Exercise18 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);

        Set keys = map.keySet();
        System.out.println("Set of keys: "+keys);
    }
}
