/*
 2. Write a Java program to iterate through all elements in an array list.
 */

import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList aa = new ArrayList();
        aa.add("Ramesh");
        aa.add("Suresh");
        aa.add("Vignesh");
        aa.add("Rajesh");
        aa.add("Rakesh");

        //METHOD - 1
        int size = aa.size();
        for (int i = 0; i < size; i++) {
            String name = (String) aa.get(i);
            System.out.println(name);
        }

        //METHOD - 2 (More Effective)
        ArrayList<String> aa1 = new ArrayList<>();
        aa1.addAll(aa);
        for(String name : aa1){
            System.out.println(name);
        }
    }
}
