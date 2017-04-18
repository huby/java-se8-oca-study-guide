package sybex.mockExamQuestions.mockExamQuestion41;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by hector on 19/03/2017.
 */
public class EJGArrayL {
    public static void main(String[] args) {
        ArrayList<String> seasons = new ArrayList<>();
        ArrayList<Object> o = new ArrayList<>();
        if(1 < 3) if(3> 4) if (true == false) System.out.println(1);
        else System.out.println(2); else System.out.println(3);


        seasons.add(1, "Spring"); seasons.add(2, "Summer");
        seasons.add(3, "Autumn"); seasons.add(4, "Winter");
        seasons.remove(2);

        for (String s : seasons) {
            System.out.print(s + ", ");
        }
    }
}
