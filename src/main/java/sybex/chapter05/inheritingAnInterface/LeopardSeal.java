package sybex.chapter05.inheritingAnInterface;

/**
 * Created by hector on 28/01/2017.
 */
//public class LeopardSeal implements HasTail, HasWhiskers {//DOES NOT COMPILE
public class LeopardSeal implements HasTail, HasWhiskers {
    public int getTailLength() {
        return 0;
    }

    public int getNumberOfWhiskers() {
        return 0;
    }
}
