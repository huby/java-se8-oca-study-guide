package manning.chapter04.localTime.queryingLocalTime;

import java.time.LocalTime;

/**
 * Created by Hector Huby on 18/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 20, 12, 98547);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());

        LocalTime shreyaFinishTime = LocalTime.parse("17:09:04");
        LocalTime paulFinishTime = LocalTime.parse("17:09:12");
        if (shreyaFinishTime.isBefore(paulFinishTime)) {
            System.out.println("Shreya wins");
        } else {
            System.out.println("Paul wins");
        }

    }
}
