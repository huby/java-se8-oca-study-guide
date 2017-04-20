package manning.chapter04.period.queryingPeriodInstances;

import java.time.Period;

/**
 * Created by Hector Huby on 19/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        Period period = Period.of(2, 4, 2);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        Period days5 = Period.of(0, 0, 5);
        System.out.println(days5.isZero());

        Period daysMinus5 = Period.of(5, 0, -5);
        System.out.println(daysMinus5.isNegative());

    }
}
