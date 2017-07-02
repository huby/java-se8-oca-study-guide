package manning.mockExam.mockExamQuestion72.manning.mockExam.mockExamQuestion62;

/**
 * Created by Hector Huby on 16/03/2017.
 */
public class Chair implements Jumpable, Moveable {
    int height = 3;

    Chair() {
        worldRecord();
    }

    public static void main(String[] args) {
        Jumpable j = new Chair();
        Moveable m = new Chair();
        Chair c = new Chair();

    }
}

interface Jumpable {
    int height = 1;
    default void worldRecord() {
        System.out.println(height);
    }
}

interface Moveable {
    int height = 2;
    static void worldRecord() {
        System.out.println(height);
    }
}