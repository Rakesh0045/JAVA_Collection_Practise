/*
 19. Write a Java program to get all the values from a HashMap collection
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Exercise19 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);

        Collection values = map.values();
        System.out.println("Set of values: " + values);
    }
}
