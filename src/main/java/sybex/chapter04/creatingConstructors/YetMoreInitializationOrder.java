package sybex.chapter04.creatingConstructors;

/**
 * Created by hector on 29/12/2016.
 */
public class YetMoreInitializationOrder {
    static {
        add(2);
    }

    static void add(int num) {
        System.out.println(num + " ");
    }

    YetMoreInitializationOrder() {
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static {
        System.out.println("inside static call to constructor");
        new YetMoreInitializationOrder();
    }

    {
        add(8);
    }

    public static void main(String[] args) {

    }

}
