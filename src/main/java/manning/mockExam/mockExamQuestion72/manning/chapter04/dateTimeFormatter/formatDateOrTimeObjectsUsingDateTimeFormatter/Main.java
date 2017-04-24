package manning.mockExam.mockExamQuestion72.manning.chapter04.dateTimeFormatter.formatDateOrTimeObjectsUsingDateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by Alvaro Alcocer on 20/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        LocalDate date = LocalDate.of(2057, 8, 11);
        LocalTime time01 = LocalTime.now();
        System.out.println(date.format(formatter));
        System.out.println(formatter.format(date));
        System.out.println(time01.format(formatter));

        // What happens if you pass a time object (LocalTime) instead of a date object
        // (LocalDate) in the preceding code? java.time.temporal.UnsupportedTemporalTypeException
        LocalTime time = LocalTime.now();
        System.out.println(formatter.format(time));

    }
}
