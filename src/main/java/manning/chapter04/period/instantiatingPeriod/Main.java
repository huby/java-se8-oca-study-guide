package manning.chapter04.period.instantiatingPeriod;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by Hector Huby on 19/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 7);
        Period period2 = Period.ofYears(2);
        Period period3 = Period.ofMonths(5);
        Period period4 = Period.ofWeeks(10);
        Period period5 = Period.ofDays(15);

        Period period6 = Period.ofDays(15);

        Period p5Yrs1 = Period.parse("P5y");
        Period p5Yrs2 = Period.parse("p5y");
        Period p5Yrs3 = Period.parse("P5Y");
        Period p5Yrs4 = Period.parse("+P5Y");
        Period p5Yrs5 = Period.parse("P+5Y");
        Period p5Yrs6 = Period.parse("-P-5Y");

        System.out.printf("%s : %s", p5Yrs1, p5Yrs2);
        System.out.println();
        System.out.printf("-P-5Y: %s", p5Yrs6);
        System.out.println();

        Period p5Yrs7 = Period.parse("P5y1m2d");
        Period p5Yrs8 = Period.parse("p9m");
        Period p5Yrs9 = Period.parse("P60d");

        // For the string form PnW, the count of weeks is multiplied by 7 to
        // get the number of days
        Period p5Yrs10 = Period.parse("-P5Y5W");

        System.out.printf("p5Yrs7: %s,  p5Yrs8: %s, p5Yrs9: %s, p5Yrs10: %s",
                p5Yrs7,
                p5Yrs8,
                p5Yrs9,
                p5Yrs10);
        System.out.println();

        // static method between
        LocalDate carnivalStart = LocalDate.of(2050, 12, 31);
        LocalDate carnivalEnd = LocalDate.of(2051, 1, 2);

        // period = endDate - startDate
        Period periodBetween = Period.between(carnivalEnd, carnivalStart);
        System.out.println(periodBetween );

    }
}
