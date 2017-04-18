package sybex.chapter04.creatingConstructors;

/**
 * Created by hector on 27/12/2016.
 */
public class Hamster {
    private String color;
    private int weight;
    public Hamster(int weight) {
        //first
        //System.out.println("in the constructor"); //DOES NOT COMPILE
        this(weight, "brown");
    }

    public Hamster(int weight, String color) { //second constructor
        this.weight = weight;
        this.color = color;
    }
}
