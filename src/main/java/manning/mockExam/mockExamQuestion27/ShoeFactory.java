package manning.mockExam.mockExamQuestion27;

/**
 * Created by Hector Huby on 15/03/2017.
 */
public class ShoeFactory {
    ShoeFactory(Boot val) {
        System.out.println("boot");
    }

    ShoeFactory(Shoe val) {
        System.out.println("shoe");
        double a = 0;
        float b = 0;
        if(a < 10) {

        }
    }
}

class Shoe {

}

class Boot extends Shoe {

}