package manning.chapter02.wrappreClasses.autoboxingAndUnboxing;

import java.util.ArrayList;

/**
 * Created by Alvaro Alcocer on 06/04/2017.
 */
public class Unboxing {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(12.12);
        list.add(11.24);
        Double total = 0.0;
        for(Double d : list)
            total += d;
    }
}
