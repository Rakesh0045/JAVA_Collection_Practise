/*
 14. Write a Java program to check whether a Vector collection contains a specified item or not
 */

import java.util.Vector;

public class Exercise14 {
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

        System.out.println("Does the Vector contains item Gub Gub : " + v.contains("Gub Gub"));
    }
}
