/*
 1. Write a Java program to create a stack using Stack collection
 */

import java.util.Stack;

public class Exercise1 {
    public static void main(String[] args) {
        Stack st = new Stack<>();
        st.push("Adam");
        st.push("Bill");
        st.push("Calcifer");
        st.push("Danny");
        st.push("Erwin");

        System.out.println(st);
    }
}