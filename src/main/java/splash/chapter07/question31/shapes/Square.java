package splash.chapter07.question31.shapes;

/**
 * Created by hector on 29/06/2017.
 */

abstract class Parallelogram {
    private int getEqualSides() {return 0;}
}

abstract class Rectangle extends Parallelogram {
    public static int getEqualSides() {return 2;}
}

public final class Square extends Rectangle {
    //public int getEqualSides() {return 4;}
}
