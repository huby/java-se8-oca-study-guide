package sybex.chapter04.understandingArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hector on 11/12/2016.
 */
public class ConvertingBetweenArrayAndList {
    /*public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length);
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length);
    }*/

    public static void main(String[] args) {
        String[] array = {"hawk", "robin"};
        List<String> list = Arrays.asList(array);
        System.out.println(list.size());
        list.set(1, "test");
        array[0] = "new";

        for(String b: array) {
            System.out.print(b + " "); //new test
        }

        //list.remove(1);
    }
}
