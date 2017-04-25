package manning.chapter06.simpleLambdaExpressions.comparingPassingValuesWithPassingCodeToMethods;

/**
 * Created by Alvaro Alcocer on 24/04/2017.
 */
public class ValidateName implements Validate{

    @Override
    public boolean check(Emp emp) {
        return (emp.getName().startsWith("P"));
    }
}
