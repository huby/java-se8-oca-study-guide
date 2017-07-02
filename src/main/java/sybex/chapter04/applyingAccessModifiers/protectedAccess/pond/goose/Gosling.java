package sybex.chapter04.applyingAccessModifiers.protectedAccess.pond.goose;

import sybex.chapter04.applyingAccessModifiers.protectedAccess.pond.shore.Bird;//in a different package

/**
 * Created by Hector Huby on 22/12/2016.
 */
public class Gosling extends Bird {//extends means create subclass
    public void swim() {
        floatIntWater();//calling protected member
        System.out.println(text);//calling protected member
    }

    public void otherGoslingSwim() {
        Goose goose = new Goose();
        //goose.fl//DOES NOT COMPILE
    }
}
