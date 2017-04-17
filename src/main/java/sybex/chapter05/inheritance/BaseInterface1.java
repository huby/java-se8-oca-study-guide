package sybex.chapter05.inheritance;

/**
 * Created by Alvaro Alcocer on 06/03/2017.
 */
public interface BaseInterface1 {
    default String getName() {
        return "nombre";
    }
}
