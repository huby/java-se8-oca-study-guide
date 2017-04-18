package manning.mockExam.mockExamQuestion71;

/**
 * Created by Hector Huby on 17/03/2017.
 */
public class Home {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            ((Father) p).dance();
        } finally {

        }
    }
}

class Person {}

class Father extends Person {
    public void dance() throws ClassCastException {}
}
