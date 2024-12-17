/*
 11. Write a Java program to Reversing a String using a Stack
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Stack;

public class Exercise11 {
    public static void main(String[] args) throws IOException {

        Stack<Character> st = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String string = br.readLine();
        char[] character = string.toCharArray();

        for (char c : character) {
            st.push(c);
        }

        System.out.println(st);

        // Approach-2

        System.out.println("The Reverse of the String is: ");

        Stack<Character> st1 = (Stack) st.clone();
        Collections.reverse(st1);
        System.out.println(st1);

        // Approach-1

        StringBuilder reverse = new StringBuilder();
        while (!st.isEmpty()) {
            reverse.append(st.pop());
        }

        System.out.println("The Reverse of the String is: " + reverse);

    }
}
