package manning.chapter04.dateTimeFormatter.formatDateOrTimeObjectsUsingDateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by hector on 23/04/2017.
 */
public class UsingStringPatterns {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2057, 8, 11);
        LocalTime time = LocalTime.of(14, 30, 15);

        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("y");
        DateTimeFormatter d2 = DateTimeFormatter.ofPattern("YYYY");
        DateTimeFormatter d3 = DateTimeFormatter.ofPattern("Y M D");
        DateTimeFormatter d4 = DateTimeFormatter.ofPattern("e");

        DateTimeFormatter t1 = DateTimeFormatter.ofPattern("H h m s");
        DateTimeFormatter t2 = DateTimeFormatter.ofPattern("'Time now:' HH mm a");

        System.out.println(d1.format(date));
        System.out.println(d2.format(date));
        System.out.println(d3.format(date));
        System.out.println(d4.format(date));

        System.out.println(t1.format(time));
        System.out.println(t2.format(time));
    }
}
