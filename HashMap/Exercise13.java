/*
 13. Write a Java program to Checking duplicate key insertion in HashMap
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

public class Exercise13 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ashitaka");
        map.put(2, "Billy");
        map.put(3, "Charlie");
        map.put(4, "Donald");
        map.put(5, "Erwin");
        map.put(5, "Eren");

        for (Map.Entry element : map.entrySet()) {
            System.out.println("Key: " + element.getKey());
            System.out.println("Value: " + element.getValue());
        }
    }
}
