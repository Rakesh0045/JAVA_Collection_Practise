/*
 13. Write a Java program to compare two Vector collections
 */

import java.util.Vector;

public class Exercise13 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.addElement("Adam");
        v.addElement("Bill");
        v.addElement("Charlie");
        v.addElement("Danny");
        v.addElement("Erwin");
        v.addElement("Frank");
        v.addElement("Gub Gub");
        System.out.println(v);

        Vector<String> v1 = new Vector<>();
        v1.addElement("Adam");
        v1.addElement("Bill");
        v1.addElement("Charlie");
        v1.addElement("Danny");
        System.out.println(v1);

        System.out.println("Comparing Vector1 and Vector2");

        Vector<String> v2 = new Vector<>();
        for (String element : v) {
            v2.add(v1.contains(element) ? "Yes" : "No");
        }

        System.out.println(v2);
    }
}
