/*
 8. Write a Java program to get the size of Stack collection
 */

import java.util.Stack;

public class Exercise8 {
    public static void main(String[] args) {

        Stack<String> st = new Stack();
        st.push("Red");
        st.push("Green");
        st.push("Black");
        st.push("Pink");
        System.out.println(st);

        System.out.println("Size of the Stack: " + st.size());
    }
}
