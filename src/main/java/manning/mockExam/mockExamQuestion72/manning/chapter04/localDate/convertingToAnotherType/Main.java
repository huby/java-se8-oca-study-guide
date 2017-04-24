package manning.mockExam.mockExamQuestion72.manning.chapter04.localDate.convertingToAnotherType;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by Hector Huby on 18/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        // The LocalDate class define overloaded atTime() instance methods
        // This method combine LocalDate with time to create and return LocalDatetime,
        // which stores both the date and time
        LocalDate interviewDate = LocalDate.of(2016, 02, 28);
        System.out.println(interviewDate.atTime(16, 30));
        System.out.println(interviewDate.atTime(16, 30, 20));
        System.out.println(interviewDate.atTime(16, 30, 20, 300));
        System.out.println(interviewDate.atTime(LocalTime.of(16, 30)));

        // The method toEpochDay() to convert LocalDate to the epoch date
        // the count of days from January 1, 1970
        LocalDate launchBook = LocalDate.of(2016, 2, 8);
        LocalDate aDate = LocalDate.of(1970, 1, 8);
        System.out.println(launchBook.toEpochDay());
        System.out.println(aDate.toEpochDay());
    }
}
