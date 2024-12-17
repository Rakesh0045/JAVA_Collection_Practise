/*
 12. Write a Java program to Checking Balanced Parentheses using a Stack
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Exercise12 {
    public static void main(String[] args) throws IOException {
        Stack<Character> st = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String with Parentheses '(' ')' :");
        String string = br.readLine();
        char[] character = string.toCharArray();

        for (char c : character) {
            st.push(c);
        }

        System.out.println(st);

        int count1 = 0;
        int count2 = 0;

        while (!st.isEmpty()) {
            char c = st.pop();

            if (")".equals(c)) {
                count1 += 1;
            } else if ("(".equals(c)) {
                count2++;
            }
        }

        if (count1 == count2) {
            System.out.println("Parentheses are balanced");
        }

    }
}
