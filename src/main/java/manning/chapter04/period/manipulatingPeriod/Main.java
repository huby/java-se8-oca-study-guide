package manning.chapter04.period.manipulatingPeriod;

import java.time.Period;

/**
 * Created by Hector Huby on 19/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        Period period10Days = Period.of(0, 0, 10);
        Period period1Month = Period.of(0, 1, 0);

        System.out.println(period10Days.minus(period1Month));
        System.out.println(period10Days.minusDays(5));
        System.out.println(period10Days.minusMonths(5));
        System.out.println(period10Days.minusYears(5));
    }
}
