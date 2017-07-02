package sybex.chapter04.reviewQuestions.question27;

/**
 * Created by hector on 03/01/2017.
 */
public class Question27 {
    public static void main(String[] args) {
        //  check((h, l) -> h.a);
    }

    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10))
            System.out.println("too high");
        else
            System.out.println("ok");
    }
}

interface Climb {
    boolean isTooHigh(int height, int limit);
}


