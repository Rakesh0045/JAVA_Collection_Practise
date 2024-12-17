/*
 2. Write a Java program to create a stack with hybrid items using Stack collection
 */

import java.util.Stack;

public class Exercise2 {
    public static void main(String[] args) {
        Stack st = new Stack<>();
        st.push("Adam");
        st.push(50);
        st.push(new String("Adam"));
        st.push(123.99);
        st.push(true);

        System.out.println(st);
    }
}
