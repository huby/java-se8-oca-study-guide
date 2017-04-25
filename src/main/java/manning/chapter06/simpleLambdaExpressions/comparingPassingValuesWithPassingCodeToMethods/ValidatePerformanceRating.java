package manning.chapter06.simpleLambdaExpressions.comparingPassingValuesWithPassingCodeToMethods;

/**
 * Created by Alvaro Alcocer on 24/04/2017.
 */
public class ValidatePerformanceRating implements Validate {

    @Override
    public boolean check(Emp emp) {
        return (emp.getPerformanceRating() >= 5);
    }
}
