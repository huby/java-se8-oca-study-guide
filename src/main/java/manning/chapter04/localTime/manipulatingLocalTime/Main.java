package manning.chapter04.localTime.manipulatingLocalTime;

import java.time.LocalTime;

/**
 * Created by Hector Huby on 18/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        LocalTime movieStartTime = LocalTime.parse("21:00:00");
        int commuteMin = 35;
        LocalTime shreyaStartTime = movieStartTime.minusMinutes(commuteMin);
        System.out.println("Start by" + shreyaStartTime + " from the office");

        // second example
        int worldRecord = 10;
        LocalTime raceStartTime = LocalTime.of(8, 10, 55);
        System.out.println("raceStartTime: " + raceStartTime);
        LocalTime raceEndTime = LocalTime.of(8, 11, 11);
        System.out.println("raceEndTime: " + raceEndTime);
        System.out.println("raceEndTime plus 10 seconds: " + raceStartTime.plusSeconds(worldRecord));

        if (raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime)) {
            System.out.println("New world record");
        } else {
            System.out.println("Try harder");
        }

        // whith
        LocalTime startTime = LocalTime.of(5, 7, 9);
        if (startTime.getMinute() < 30) {
            startTime = startTime.withMinute(0);
        }
        System.out.println(startTime);

    }
}
