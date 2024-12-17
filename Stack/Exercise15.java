/*
 15. Write a Java program to add an ArrayList into Stack collection
 */

import java.util.ArrayList;
import java.util.Stack;

public class Exercise15 {
    public static void main(String[] args) {
        Stack<String> st = new Stack();
        st.push("Red");
        st.push("Green");
        st.push("Black");
        st.push("Pink");
        System.out.println("Stack : " + st);

        ArrayList aa = new ArrayList<>();
        aa.add("Adam");
        aa.add("Bill");
        aa.add("Charlie");
        aa.add("Danny");
        System.out.println("ArrayList : " + aa);

        System.out.println("Adding ArrayList into Stack");
        st.addAll(aa);
        System.out.println("Stack : " + st);
    }
}
