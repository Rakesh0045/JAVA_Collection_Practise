/*
 3. Write a Java program to copy all of the mappings from the specified map to another map
 */

import java.util.HashMap;

public class Exercise3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(6, "Finn");
        map1.put(7, "Gregson");
        map1.put(8, "Hange");
        System.out.println(map1);

        System.out.println("Copying all the mappings from HashMap1 into HashMap2");
        map1.putAll(map);
        System.out.println(map1);
    }
}
