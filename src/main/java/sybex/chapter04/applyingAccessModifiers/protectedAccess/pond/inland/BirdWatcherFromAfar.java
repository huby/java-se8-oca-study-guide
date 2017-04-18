package sybex.chapter04.applyingAccessModifiers.protectedAccess.pond.inland;

import sybex.chapter04.applyingAccessModifiers.protectedAccess.pond.shore.Bird;//different package

/**
 * Created by Hector Huby on 22/12/2016.
 */
public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
        //bird.floatIntWater();//DOES NOT COMPILE
        //System.out.println(bird.text);//DOES NOT COMPILE
    }
}
