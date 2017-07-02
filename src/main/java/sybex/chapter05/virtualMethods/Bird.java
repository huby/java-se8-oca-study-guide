package sybex.chapter05.virtualMethods;

/**
 * Created by hector on 30/01/2017.
 */
public class Bird {
    public String getName() {
        return "Unknown";
    }

    public void displayInformation() {
        System.out.println("The bird name is: " + getName());
    }

}
