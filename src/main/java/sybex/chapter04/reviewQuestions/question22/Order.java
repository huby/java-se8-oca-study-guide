package sybex.chapter04.reviewQuestions.question22;

/**
 * Created by hector on 07/01/2017.
 */
public class Order {
    static String result = "";
    {
        System.out.println("Instance initializer -> result += c");
        result += "c";
    }

    static {
        System.out.println("Static initializer -> result += u");
        result += "u";
    }

    {
        System.out.println("Intance initializer -> result += r");
        result += "r";
    }
}
