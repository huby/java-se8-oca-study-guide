package sybex.chapter04.applyingAccessModifiers.protectedAccess.pond.shore;//Same package

/**
 * Created by Alvaro Alcocer on 22/12/2016.
 */
public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatIntWater();//calling protected member
        System.out.println(bird.text);//calling protected member
    }
}
