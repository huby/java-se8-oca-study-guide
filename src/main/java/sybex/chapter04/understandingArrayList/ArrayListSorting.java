package sybex.chapter04.understandingArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by hector on 11/12/2016.
 */
public class ArrayListSorting {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
