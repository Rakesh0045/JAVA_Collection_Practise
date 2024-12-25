/*
 16. Write a Java Program to get value from HashMap when the key is provided
 */

import java.util.HashMap;

public class Exercise16 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);

        System.out.println("Provided Key: 5");
        System.out.println("Value for Key=5 : " + map.get(5));

    }
}
