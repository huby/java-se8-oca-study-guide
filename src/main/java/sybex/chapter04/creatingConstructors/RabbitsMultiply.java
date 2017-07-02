package sybex.chapter04.creatingConstructors;

/**
 * Created by hector on 27/12/2016.
 */
public class RabbitsMultiply {
    public static void main(String[] args) {
        Rabbit1 rabbit1 = new Rabbit1();
        Rabbit2 rabbit2 = new Rabbit2();
        Rabbit3 rabbit3 = new Rabbit3(true);
        //Rabbit4 rabbit4 = new Rabbit4();//DOES NOT COMPILE
    }
}

class Rabbit1 {

}

class Rabbit2 {
    public Rabbit2() {

    }
}

class Rabbit3 {
    public Rabbit3(boolean b) {

    }
}

class Rabbit4 {
    private Rabbit4() {

    }
}
