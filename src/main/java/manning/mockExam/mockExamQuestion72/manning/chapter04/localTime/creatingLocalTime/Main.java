package manning.mockExam.mockExamQuestion72.manning.chapter04.localTime.creatingLocalTime;

import java.time.LocalTime;

/**
 * Created by Hector Huby on 18/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        // Hours, minutes
        LocalTime timeHrsMin = LocalTime.of(12, 12);
        // Hours, minutes and seconds
        LocalTime timeHrsMinSec = LocalTime.of(0, 12, 6);
        // Hours, minutes, seconds and nanoseconds
        LocalTime timeHrsMinSecNano = LocalTime.of(14, 7, 10, 998654578);

        // DateTimeException
        //LocalTime timeHrsMin1 = LocalTime.of(120, 12);// Runtime exception
        //LocalTime timeHrsMin2 = LocalTime.of(9986545781, 12);// Compilation error

        // To get the current time from the system clock, use the static method now()
        LocalTime date3 = LocalTime.now();

        // Parse a string to instantiate LocalTime by using its static method parse()
        LocalTime time = LocalTime.parse("15:08:23");


    }
}
