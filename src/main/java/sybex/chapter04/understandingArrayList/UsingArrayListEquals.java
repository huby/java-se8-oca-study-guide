package sybex.chapter04.understandingArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hector on 10/12/2016.
 */
public class UsingArrayListEquals {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two));
        one.add("a");
        System.out.println(one.equals(two));
        two.add("a");
        System.out.println(one.equals(two));
        one.add("b");
        two.add(0, "b");
        System.out.println("arralist two: " + two);
        System.out.println(one.equals(two));
    }
}
