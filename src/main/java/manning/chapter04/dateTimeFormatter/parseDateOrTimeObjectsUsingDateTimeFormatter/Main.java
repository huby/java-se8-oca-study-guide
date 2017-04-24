package manning.chapter04.dateTimeFormatter.parseDateOrTimeObjectsUsingDateTimeFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by hector on 23/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        DateTimeFormatter d1 = DateTimeFormatter.ISO_DATE;
        LocalDate ld = LocalDate.from(d1.parse("2020-12-12"));
        System.out.println(ld );
    }
}
