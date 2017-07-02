package sybex.mockExamQuestions.mockExamQuestion11;

/**
 * Created by hector on 13/03/2017.
 */
public class EJava {
    public static void main(String[] args) {
        Person person = new Person();
        Moveable moveable = (x) -> Person.MAX_DISTANCE + x;
        System.out.println(person.name + person.height + person.result + person.age + moveable.move(20));
        System.out.println(person.height);
    }
}
