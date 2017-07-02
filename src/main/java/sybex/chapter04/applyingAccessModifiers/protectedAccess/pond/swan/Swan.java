package sybex.chapter04.applyingAccessModifiers.protectedAccess.pond.swan;

import sybex.chapter04.applyingAccessModifiers.protectedAccess.pond.shore.Bird;//in difference package than Bird

/**
 * Created by Hector Huby on 22/12/2016.
 */
public class Swan extends Bird {//but subclass of Bird
    public void swim() {
        floatIntWater();//package access to superclass
        System.out.println(text);//package access to superclass
    }

    public void helpOtherSwamSwim() {
        Swan other = new Swan();//package access to superclass
        other.floatIntWater();//package access to superclass
        System.out.println(other.text);
    }

    public void helpOtherBirdSwin() {
        Bird other = new Bird();
        //other.floatIntWater();//DOES NOT COMPILE
        //System.out.println(other.text);//DOES NOT COMPILE
    }
}
