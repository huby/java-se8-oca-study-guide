package manning.mockExam.mockExamQuestion43;

/**
 * Created by Alvaro Alcocer on 16/03/2017.
 */
public class Whale {
    public static void main(String[] args) {
        boolean hungry = false;
        while (hungry = true) {
            Fish.count ++;
        }
        System.out.println(Fish.count);
    }
}

class Fish {
    static byte count;
}
