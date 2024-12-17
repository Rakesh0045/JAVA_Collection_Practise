/*
 7. Write a Java program to create a Stack collection of objects of a class
 */

import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        int i = 0;
        Stack<Complex> stack_list = new Stack<Complex>();

        stack_list.push(new Complex(10, 50));
        stack_list.push(new Complex(20, 60));
        stack_list.push(new Complex(30, 70));
        stack_list.push(new Complex(40, 80));

        System.out.println("Stack Items : ");

        for (i = 0; i < 4; i++) {
            Complex C = stack_list.pop();
            System.out.println(C.real + " + " + C.img + "i");
        }
    }
}

class Complex {
    int real, img;

    Complex(int r, int i) {
        real = r;
        img = i;
    }
}
