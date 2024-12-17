/*
 13. Write a Java program to Check Palindrome or Not
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Stack;

public class Exercise13 {
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

        // Approach-1

        StringBuilder reverse = new StringBuilder();
        while (!st.isEmpty()) {
            reverse.append(st.pop());
        }

        System.out.println("The Reverse of the String is: " + reverse);

        // StringBuilder does not override toString()
        if (String.valueOf(reverse).equals(string)) {
            System.out.println("Given Input is a Pallindrome sequence");
        } else {
            System.out.println("Given Input is not a Pallindrome sequence");
        }

    }
}
