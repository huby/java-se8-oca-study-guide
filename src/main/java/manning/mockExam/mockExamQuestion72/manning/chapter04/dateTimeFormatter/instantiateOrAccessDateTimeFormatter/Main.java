package manning.mockExam.mockExamQuestion72.manning.chapter04.dateTimeFormatter.instantiateOrAccessDateTimeFormatter;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by Alvaro Alcocer on 20/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);

        DateTimeFormatter formatter5 = DateTimeFormatter.BASIC_ISO_DATE;

        // 2057-08-11
        DateTimeFormatter isoLocalDate = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter isoDate = DateTimeFormatter.ISO_DATE;

        // 14:30:15.312
        DateTimeFormatter isoTime = DateTimeFormatter.ISO_TIME;
        DateTimeFormatter isoLocalTime = DateTimeFormatter.ISO_LOCAL_TIME;

        // 2050-08-11T14:30:15.312
        DateTimeFormatter isoDateTime = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter isoLocaDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;


    }
}
