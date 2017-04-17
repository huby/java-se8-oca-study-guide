package manning.chapter04.localDate.creatingLocalDate;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by Alvaro Alcocer on 12/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2015, 12, 27);
        LocalDate date2 = LocalDate.of(2015, Month.DECEMBER, 27);

        // to get the current date from system clock, use static method now
        LocalDate date3 = LocalDate.now();

        // parse a string in the format 2016-06-27 to instantiate LocalDate
        LocalDate date4 = LocalDate.parse("2016-06-27");

        // if you pass invalid values to parse() or of(), you get DateTimeParseException
        // the format of string passed to parse() must be exactly of the format 9999-99-99
        // for days and months with values 1-9, pass 01-09
        //LocalDate date5 = LocalDate.parse("2016-06-7");//java.time.format.DateTimeParseException
    }
}
