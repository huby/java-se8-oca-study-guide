package sybex.chapter04.understandingArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hector on 11/12/2016.
 */
public class WrapperClasses {
    public static void main(String[] args) {
        List<Double> weights = new ArrayList<>();
        weights.add(50.5);
        weights.add(new Double(60));
        weights.remove(new Double(50.5));
        System.out.println(weights);
        double first = weights.get(0);
        System.out.println("first: " + first);
    }
}
