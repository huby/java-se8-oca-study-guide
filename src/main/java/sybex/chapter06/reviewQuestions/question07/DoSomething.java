package sybex.chapter06.reviewQuestions.question07;

import chapter06.reviewQuestions.question06.Beetle;

import javax.jws.Oneway;

/**
 * Created by hector on 04/02/2017.
 */
public class DoSomething extends Beetle {
    public void go() {
        System.out.print("A");

        try {

        } catch (ArithmeticException e) {
            System.out.print("B");
        } finally {
            System.out.println("C");
        }
    }

    public void stop() {
        System.out.print("E");
        Object x = null;
        x.toString();
        System.out.println("F");
    }

    public static void main(String[] args) {
        DoSomething doSomething = new DoSomething();
        //doSomething.suma();
        //new DoSomething();


    }
}
