package sybex.chapter04.applyingAccessModifiers.protectedAccess.pond.goose;

import sybex.chapter04.applyingAccessModifiers.protectedAccess.pond.shore.Bird;

/**
 * Created by Alvaro Alcocer on 22/12/2016.
 */
public class Goose extends Bird{
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatIntWater();
        System.out.println(other.text);
    }

    public void helpOtherGooseSwim() {
        Bird other = new Goose();
        //other.floatIntWater();//DOES NOT COMPILE
        //System.out.println(other.text);//DOES NOT COMPILE
    }
}
