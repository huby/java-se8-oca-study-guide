package sybex.chapter05.reviewQuestions;

/**
 * Created by Alvaro Alcocer on 09/02/2017.
 */
public class Question19 {
    public String getNumberOfGills() {
        return "4";
    }

    public int getNumberOfGills(int input) {
        return 6;
    }

    public static void main(String[] args) {
        boolean bankrupt = true;
        do System.out.println("enjoying shopping");

        while (!bankrupt);
    }

    private void method2(int age) throws Exception {
        if(age > 30) throw new Exception();
    }

    protected double method4() throws Throwable {
        throw new Throwable();
    }

    public double method5() throws Exception{
        return 0.7;
    }

}