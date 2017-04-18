package manning.chapter04.localTime.usingLocalTimeConstants;

import java.time.LocalTime;

/**
 * Created by Hector Huby on 18/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(LocalTime.MIN.equals(LocalTime.MIDNIGHT));
    }
}
