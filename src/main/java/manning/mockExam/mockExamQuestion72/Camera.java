package manning.mockExam.mockExamQuestion72;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by Alvaro Alcocer on 17/03/2017.
 */
public class Camera {
    public static void main(String[] args) {
        int hours;
        LocalDateTime now = LocalDateTime.of(220, 10, 01, 0, 0);
        LocalDate before = now.toLocalDate().minusDays(1);
        LocalTime after = now.toLocalTime().plusHours(1);

        /*while (before.isBefore(after) && hours < 4) {
            ++hours;
        }*/

    }
}
