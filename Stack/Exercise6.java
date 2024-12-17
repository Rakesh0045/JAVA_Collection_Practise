/*
 6. Write a Java program to convert a Stack collection into an Object array
 */

import java.util.Stack;

public class Exercise6 {
    public static void main(String[] args) {

        Stack<String> st = new Stack();
        st.push("Red");
        st.push("Green");
        st.push("Black");
        st.push("Pink");
        System.out.println(st);

        System.out.println("Converting this Stack into Array of objects");

        Object[] arr = st.toArray();

        for (Object element : arr) {
            System.out.println(element);
        }

    }
}
