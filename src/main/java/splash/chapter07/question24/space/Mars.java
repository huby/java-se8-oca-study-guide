package splash.chapter07.question24.space;

/**
 * Created by hector on 29/06/2017.
 */
interface Sphere {
    default String getName() {return "Unknown";}
}

abstract class Planet {
    abstract String getName();
}

public class Mars extends Planet implements Sphere{

    public Mars() {
        super();
    }

    public String getName() {
        return "Mars";
    }

    public static void main(final String[] probe) {
        System.out.println(((Sphere) new Mars()).getName());
    }
}
