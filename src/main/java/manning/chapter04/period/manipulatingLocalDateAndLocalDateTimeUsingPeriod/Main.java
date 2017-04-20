package manning.chapter04.period.manipulatingLocalDateAndLocalDateTimeUsingPeriod;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * Created by Hector Huby on 19/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2052, 01, 31);
        System.out.println(date.minus(Period.ofDays(1)));

        // Because Period instances can represent positive or negative periods
        // (like 15 days and -15 days), you can subtract days from a LocalDate or
        // LocalDateTime by calling the method plus
        System.out.println(date.plus(Period.ofDays(-1)));

        // Similarly, the method minus() with the classes LocalDate and LocalDateTime
        // to subtract a period of years, month, weeks, or days
        LocalDateTime dateTime = LocalDateTime.parse("2020-01-31T14:18:36");
        System.out.println(dateTime.minus(Period.ofYears(2)));

        LocalDate localDate = LocalDate.of(2052, 01, 31);
        System.out.println(localDate.minus(Period.ofWeeks(4)));

    }
}
