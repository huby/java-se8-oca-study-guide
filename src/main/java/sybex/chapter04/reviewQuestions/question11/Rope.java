package sybex.chapter04.reviewQuestions.question11;

/**
 * Created by hector on 07/01/2017.
 */
public class Rope {
    public static void swing() {
        System.out.println("swing ");
    }

    public void climb() {
        System.out.println("climb ");
    }

    public static void play() {
        swing();
        //climb();//DOES NOT COMPILE
    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null;
        rope2.play();
    }
}
