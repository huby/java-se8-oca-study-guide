package sybex.chapter06.errorHandling;

/**
 * Created by hector on 22/02/2017.
 */
public class TwistInTaleCatchError {
    public static void main(String[] args) {
        try {
            myMethod();
        } catch (StackOverflowError s) {
            for (int i = 0; i < 2; i++) {
                System.out.println(i);
            }
        }
    }

    public static void myMethod() {
        myMethod();
    }
}
