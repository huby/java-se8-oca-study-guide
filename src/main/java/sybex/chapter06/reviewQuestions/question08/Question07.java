package sybex.chapter06.reviewQuestions.question08;

/**
 * Created by hector on 06/02/2017.
 */
public class Question07 {
    public int test() {
        int a = 0;
        int b = 0;

        try {
            return a / b;
        } catch (RuntimeException e) {
            return -1;
        /*} catch (ArithmeticException e) {
            return 0;*/
        } finally {
            System.out.print("done");
        }
    }
}
