package sybex.chapter04.applyingAccessModifiers.protectedAccess.pond.shore;

/**
 * Created by Hector Huby on 22/12/2016.
 */
public class Bird {
    protected String text = "floating";//protected access
    protected void floatIntWater() {//protected access
        System.out.println(text);
    }
}
