package sybex.chapter03.understandingJavaArrays;

/**
 * Created by Alvaro Alcocer on 24/11/2016.
 */
public class ArrayWithReferenceVariables {
    public static void main(String[] args) {
        String [] bugs = {"cricket", "beetle", "ladybug"};
        String [] alias = bugs;
        System.out.println(bugs.equals(alias));
        System.out.println(bugs.toString());

        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder();//No compila
        objects[0] = new StringBuilder();
    }
}
