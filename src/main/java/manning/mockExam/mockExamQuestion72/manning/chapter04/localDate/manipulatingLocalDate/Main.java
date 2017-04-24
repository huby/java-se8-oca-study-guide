package manning.mockExam.mockExamQuestion72.manning.chapter04.localDate.manipulatingLocalDate;

import java.time.LocalDate;

/**
 * Created by Hector Huby on 17/04/2017.
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

        // the withXX() methods return a copy of the date instance replacing the
        // specified day, month, or year in it
        System.out.println("=========================================");
        LocalDate firstSex = LocalDate.of(2036, 02, 28);
        System.out.println(firstSex.withDayOfMonth(1));
        System.out.println(firstSex.withDayOfYear(1));
        System.out.println(firstSex.withMonth(7));
        System.out.println(firstSex.withYear(1));
    }
}
