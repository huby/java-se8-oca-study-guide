package manning.chapter06.simpleLambdaExpressions.comparingPassingValuesWithPassingCodeToMethods;

/**
 * Created by Hector Huby on 24/04/2017.
 */
public class WithMethodParameters {
    void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
