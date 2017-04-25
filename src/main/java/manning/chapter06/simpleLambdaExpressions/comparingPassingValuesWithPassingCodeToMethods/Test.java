package manning.chapter06.simpleLambdaExpressions.comparingPassingValuesWithPassingCodeToMethods;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Created by Alvaro Alcocer on 24/04/2017.
 */
public class Test {

    public static void main(String[] args) {
        Emp e1 = new Emp("Shreya", 5, 9999.00);
        Emp e2 = new Emp("Paul", 4, 1234.00);
        Emp e3 = new Emp("Harry", 5, 8769.00);
        Emp e4 = new Emp("Selvan", 1, 2769.00);

        ArrayList<Emp> empArrayList = new ArrayList<>();
        empArrayList.add(e1);
        empArrayList.add(e2);
        empArrayList.add(e3);
        empArrayList.add(e4);

        Validate validatePerfor = (Emp e) -> e.getPerformanceRating() >= 5;
        Predicate<Emp> validate = (Emp emp) -> emp.getPerformanceRating() >= 5;

        //filterByPredicate(empArrayList, validate);
        //filter(empArrayList, validatePerfor);

        //Remove using ArrayList removeIf method
        System.out.println("Remove using ArrayList removeIf method");
        for (Emp emp : empArrayList) {
            System.out.println(emp);
        }

        System.out.println("After deletion:");
        empArrayList.removeIf(e -> e.getName().startsWith("S"));

        for (Emp emp : empArrayList) {
            System.out.println(emp);
        }
    }

    static void filterByPredicate(ArrayList<Emp> list, Predicate<Emp> rule) {
        for (Emp e : list) {
            if (rule.test(e)) {
                System.out.println(e);
            }
        }
    }

    static void filter(ArrayList<Emp> list, Validate rule) {
        for (Emp e : list) {
            if (rule.check(e)) {
                System.out.println(e);
            }
        }
    }
}
