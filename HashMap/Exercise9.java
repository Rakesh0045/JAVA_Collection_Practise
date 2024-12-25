/*
 9. Write a Java program to create a set view of the mappings contained in a map.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Exercise9 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        System.out.println(map);

        System.out.println("Set view of mappings in HashMap: ");
        Set s = map.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
