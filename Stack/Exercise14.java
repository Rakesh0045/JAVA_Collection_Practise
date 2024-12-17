/*
 14. Write a Java program to Decimal to Binary Conversion
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Exercise14 {

    Stack<Integer> st = new Stack<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Decimal number: ");
        int decimal = Integer.parseInt(br.readLine());

        System.out.println("The Binary Equivalent of " + decimal + " is: " + new Exercise14().decimalToBinary(decimal));

    }

    public String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        while (decimal > 0) {
            int remainder = decimal % 2;
            st.push(remainder);
            decimal /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!st.isEmpty()) {
            binary.append(st.pop());
        }

        return binary.toString();
    }
}
