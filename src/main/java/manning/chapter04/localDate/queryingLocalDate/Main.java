package manning.chapter04.localDate.queryingLocalDate;

import java.time.LocalDate;

/**
 * Created by Hector Huby on 12/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        // using instance methods like getXXXX() to query LocalDate on
        // its year, month and date values
        LocalDate date = LocalDate.parse("2020-08-30");
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());

        LocalDate shreyaBday = LocalDate.parse("2002-08-30");
        LocalDate paulBday = LocalDate.parse("2002-07-29");

        System.out.println(shreyaBday.isAfter(paulBday));
        System.out.println(shreyaBday.isBefore(paulBday));
        System.out.println(shreyaBday.isBefore(shreyaBday));
    }
}
