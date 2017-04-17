package manning.chapter04.localDate.manipulatingLocalDate;

import java.time.LocalDate;

/**
 * Created by Alvaro Alcocer on 17/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate bday = LocalDate.of(2052, 3, 10);
        System.out.println(bday.minusDays(10));
        System.out.println(bday.minusMonths(2));
        System.out.println(bday.minusWeeks(30));
        System.out.println(bday.minusYears(1));

        // the plusXX() methods return a copy of the date instance after adding
        // the specified days, months, or years to it
        LocalDate launchCompany = LocalDate.of(2016, 02, 29);
        System.out.println(launchCompany.plusDays(1));
        System.out.println(launchCompany.plusMonths(1));
        System.out.println(launchCompany.plusWeeks(7));
        System.out.println(launchCompany.plusYears(1));

    }
}
