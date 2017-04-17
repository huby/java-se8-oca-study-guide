package manning.mockExam.mockExamQuestion26;

/**
 * Created by Alvaro Alcocer on 15/03/2017.
 */
public class MyCalendar {

    public static void main(String[] args) {
        Season season1 = new Season();
        season1.name = "Spring";

        Season season2 = new Season();
        season2.name = "Autumn";

        //Predicate<String> aSeason = (s) -> s == "Summner" ? season1.name : season2.name;

        System.out.println(season1.name);
        System.out.println(season2.name);
        //System.out.println(aSeason.test(new String("Summer")));
    }
}

class Season {
    String name;
}
