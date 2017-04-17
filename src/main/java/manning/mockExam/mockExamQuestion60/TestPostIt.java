package manning.mockExam.mockExamQuestion60;

/**
 * Created by Alvaro Alcocer on 16/03/2017.
 */
public class TestPostIt extends PostIt {

    public static void main(String[] args) {
        Paper paper = new PostIt();
    }
}

class Paper {
    Paper() {
        this(10);
        System.out.println("Paper: 0");
    }

    Paper(int a) {
        System.out.println("Paper: 1");
    }
}

class PostIt extends Paper {

}