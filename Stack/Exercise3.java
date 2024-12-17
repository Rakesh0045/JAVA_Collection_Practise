/*
 3. Write a Java program to search an item in a Stack collection
 */

import java.util.Stack;

public class Exercise3 {
    public static void main(String[] args) {
        Stack st = new Stack<>();
        st.push("Adam");
        st.push(50);
        st.push(new String("Adam"));
        st.push(123.99);
        st.push(true);

        System.out.println(st);

        System.out.println("Searching for element 50");

        System.out.println("Element found at index: " + st.search(50));
    }
}
