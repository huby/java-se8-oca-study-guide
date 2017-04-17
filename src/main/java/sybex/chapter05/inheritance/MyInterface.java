package sybex.chapter05.inheritance;

/**
 * Created by Alvaro Alcocer on 06/03/2017.
 */
public interface MyInterface extends BaseInterface1, BaseInterface2 {

    @Override
    default String getName() {
        return null;
    }
}
