package sybex.chapter04.applyingAccessModifiers.protectedAccess.pond.duck;

import sybex.chapter04.applyingAccessModifiers.protectedAccess.pond.goose.Goose;

/**
 * Created by Hector Huby on 22/12/2016.
 */
public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
        //goose.floatIntWater();//DOES NOT COMPILE
    }
}
