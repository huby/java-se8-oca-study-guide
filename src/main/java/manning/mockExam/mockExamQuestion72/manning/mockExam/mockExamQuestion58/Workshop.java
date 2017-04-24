package manning.mockExam.mockExamQuestion72.manning.mockExam.mockExamQuestion58;

/**
 * Created by Hector Huby on 16/03/2017.
 */
public class Workshop {
    public static void main(String[] args) {
        Laptop life = new Laptop();
        repair(life);
        System.out.println(life.memory);
    }

    public static void repair(Laptop laptop) {
        laptop = new Laptop();
        laptop.memory = "2GB";
    }
}

class Laptop {
    String memory = "1GB";
}
