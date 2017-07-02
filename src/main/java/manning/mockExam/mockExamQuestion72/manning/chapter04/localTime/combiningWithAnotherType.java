package manning.mockExam.mockExamQuestion72.manning.chapter04.localTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by Hector Huby on 18/04/2017.
 */
public class combiningWithAnotherType {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(14, 10, 0);
        LocalDate date = LocalDate.of(2016, 02, 28);
        LocalDateTime dateTime = time.atDate(date);
        System.out.println(dateTime);
    }
}
