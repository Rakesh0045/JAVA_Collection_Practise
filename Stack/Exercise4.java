/*
 4. Write a Java program to check whether a Stack collection is empty or not
 */

import java.util.Stack;

public class Exercise4 {
    public static void main(String[] args) {
        Stack st = new Stack<>();
        st.push("Adam");
        st.push(50);
        st.push(new String("Adam"));
        st.push(123.99);
        st.push(true);

        System.out.println(st);

        System.out.println("Is the Stack empty: " + st.isEmpty());
    }
}
