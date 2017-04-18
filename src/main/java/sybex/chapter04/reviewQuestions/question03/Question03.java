package sybex.chapter04.reviewQuestions.question03;

/**
 * Created by hector on 01/01/2017.
 */
public class Question03 {


    public static int howMany(boolean b, boolean... b2) {
        return b2.length;
    }

    public static void main(String[] args) {
        howMany(true, new boolean[2]);
        int x = 4;
        long y = x;
        System.out.println(y);
    }
}
