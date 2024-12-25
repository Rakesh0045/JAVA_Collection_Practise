/*
 11. Write a Java program to get a set view of the keys contained in this map.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Exercise11 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);

        System.out.println("Set view of Keys in HashMap: ");
        Set s = map.keySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
