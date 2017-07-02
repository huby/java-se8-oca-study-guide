package sybex.chapter05.introducingClassInheritance.inheritingMethods;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.ExplicitGroup;
import com.sun.xml.internal.ws.server.sei.EndpointArgumentsBuilder;

/**
 * Created by hector on 01/07/2017.
 */
public class Child {

    String methodToInherits() throws Exception {
        try {
            String a = (String) new Object();
        } catch (Exception e) {
            throw new RuntimeException("Broke!");
        }

        return null;
    }

    public static void main(String [] args) {

        try {
            new Child().methodToInherits();
            System.out.print("Finished!");
        } catch (Throwable t) {
            System.out.println("in catch");
        }

    }
}
