/*
 10. Write a Java program to add a Stack collection into another Stack collection
 */

import java.util.Stack;

public class Exercise10 {
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

        System.out.println("Adding Stack2 into Stack1");

        st.addAll(st2);
        System.out.println(st);
    }
}
