package sybex.chapter04.creatingConstructors;

/**
 * Created by hector on 27/12/2016.
 */
public class InitializationOrderSimple {
    private String name = "Torchie";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    static {
        COUNT += 10;
        System.out.println(COUNT);
    }
    public InitializationOrderSimple() {
        System.out.println("Constructor");
    }
}
