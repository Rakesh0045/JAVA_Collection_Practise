/*
 3. Write a Java program to create a vector to store different types of objects
 */

import java.util.Vector;

public class Exercise3 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(new Complex(5, 3));
        v.addElement(new Complex(3, 7));
        v.addElement(new String("Rakesh"));
        v.addElement(10);
        v.addElement(10.76);
        System.out.println(v);

        for (Object obj : v) {
            if (obj instanceof Complex) {
                ((Complex) obj).complexDisplay();
                continue;
            }
            System.out.println(obj);
        }
    }
}

class Complex {
    int r, i;

    Complex(int r, int i) {
        this.r = r;
        this.i = i;
    }

    public void complexDisplay() {
        System.out.println(r + "+" + i + "i");
    }
}
