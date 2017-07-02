package manning.chapter04.period.convertingToAnotherType;

import java.time.Period;

/**
 * Created by Alvaro Alcocer on 20/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        // (10 * 12) + 5
        System.out.println(Period.of(10, 5, 40).toTotalMonths());
    }
}
