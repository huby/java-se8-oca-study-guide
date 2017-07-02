package manning.mockExam.mockExamQuestion72.manning.chapter04.period.manipulatingPeriod;

import java.time.LocalDate;
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

        // Send reminders to your friends (limited to printing a message)
        // for a event, say a birthday celebration, if it's due in 10 days
        LocalDate bday = LocalDate.of(2017, 04, 22);
        LocalDate today = LocalDate.now();
        Period period10Days1 = Period.of(0, 0, 10);

        if (bday.minus(period10Days1).isBefore(today))
            System.out.println("Time to send out reminders to friends");

        // The minusXXX() methods
        Period period10Days2 = Period.of(0, 0, 10);
        Period period1Month1 = Period.of(0, 1, 0);

        System.out.println(period10Days2.minus(period1Month1));
        System.out.println(period10Days2.minusDays(5));
        System.out.println(period10Days2.minusMonths(5));
        System.out.println(period10Days2.minusYears(5));

        // The Period class defines multiplyBy(int), which multiplies each element in
        // the period by integer value:
        Period year1Month9Day20 = Period.of(1, 9, 20);
        System.out.println(year1Month9Day20.multipliedBy(2));
        System.out.println(year1Month9Day20.multipliedBy(-2));

        // The plus(TemporalAmount), plusDays(long), plusWeeks(long),
        // plusMonths(long) and plusYears(long) methods add to Period
        // instances and return the modified value as a Period
        Period period5Month = Period.of(0, 5, 0);
        Period period10Month = Period.of(0, 10, 0);
        Period period10Days3 = Period.of(0, 0, 10);

        System.out.println(period5Month.plus(period10Month));
        System.out.println(period10Days.plusDays(10));
        System.out.println(period10Days.plusMonths(5));
        System.out.println(period10Days.minusYears(5));

        // withDays(), withMonths() and WithYears() methods accept a int value and
        // return a copy of Period with the specified value altered
        Period period = Period.of(2020, 12, 10);
        System.out.println(period.withDays(5));
        System.out.println(period.withMonths(24));
        System.out.println(period.withYears(2017));
    }
}
