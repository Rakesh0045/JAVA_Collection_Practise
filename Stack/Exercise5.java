/*
 5. Write a Java program to compare two Stack collections
 */

import java.util.Stack;

public class Exercise5 {
    public static void main(String[] args) {

        Stack<String> st = new Stack();
        st.push("Red");
        st.push("Green");
        st.push("Black");
        st.push("Pink");
        System.out.println(st);

        Stack<String> st2 = new Stack();
        st2.push("Red");
        st2.push("Pink");
        st2.push("Violet");
        st2.push("Orange");
        st2.push("Black");
        System.out.println(st2);

        Stack<String> st3 = new Stack();

        for (String element : st) {
            st3.push(st2.contains(element) ? "Yes" : "No");
        }

        System.out.println(st3);
    }
}
