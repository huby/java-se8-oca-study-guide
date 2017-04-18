package sybex.chapter05.virtualMethods;

/**
 * Created by hector on 30/01/2017.
 */
public class Peacok extends Bird {

    public String getName() {
        return "Peacok";
    }

    public static void main(String[] args) {
        Bird bird = new Peacok();
        bird.displayInformation();
    }

    private Exception one() {
        return new Exception();
    }
}
