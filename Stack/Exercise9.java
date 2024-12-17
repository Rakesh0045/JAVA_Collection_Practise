/*
 9. Write a Java program to traverse a Stack collection using the foreach loop
 */

import java.util.Stack;

public class Exercise9 {
    public static void main(String[] args) {

        Stack<String> st = new Stack();
        st.push("Red");
        st.push("Green");
        st.push("Black");
        st.push("Pink");
        System.out.println(st);

        System.out.println("Traversing elements by foreach loop");

        for (String element : st) {
            System.out.println(element);
        }
    }
}
