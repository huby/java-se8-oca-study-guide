package manning.mockExam.mockExamQuestion72.manning.chapter04.localDateTime;

import java.time.LocalDateTime;

/**
 * Created by Hector Huby on 18/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        LocalDateTime prizeCeremony = LocalDateTime.parse("2050-06-05T14:00:00");
        LocalDateTime dateTimeNow = LocalDateTime.now();

        if (prizeCeremony.getMonthValue() == 6)
            System.out.println("Can't invite president");
        else
            System.out.println("President invited");

        LocalDateTime chiefGuestDeparture = LocalDateTime.parse("2050-06-05T14:30:00");

        if (prizeCeremony.plusHours(2).isAfter(chiefGuestDeparture))
            System.out.println("Chief Guest will leave before ceremony completes");

        LocalDateTime eventMgrArrival = LocalDateTime.of(2050, 6, 5, 14, 14, 30, 0);
        if (eventMgrArrival.isAfter(prizeCeremony.minusHours(3)))
            System.out.println("Manager is supposed to arrive 3 hrs earlier");
    }
}
