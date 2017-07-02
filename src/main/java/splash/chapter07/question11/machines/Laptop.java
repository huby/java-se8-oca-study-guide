package splash.chapter07.question11.machines;

/**
 * Created by hector on 29/06/2017.
 */

class Computer {
    protected final int process() { return 5; }
}

public class Laptop extends Computer{
    final public static int process(int a) {return 3;}
}
