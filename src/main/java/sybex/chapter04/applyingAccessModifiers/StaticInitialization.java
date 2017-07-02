package sybex.chapter04.applyingAccessModifiers;

/**
 * Created by hector on 25/12/2016.
 */
public class StaticInitialization {
    private static final int NUM_SECONDS_PER_HOUR;
    private int minutos;
    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }
}
