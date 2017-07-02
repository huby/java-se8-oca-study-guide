package sybex.chapter04.understandingArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hector on 10/12/2016.
 */
public class UsingArrayListContains {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        System.out.println(birds.contains("hawk"));
        System.out.println(birds.contains("robin"));
    }
}
