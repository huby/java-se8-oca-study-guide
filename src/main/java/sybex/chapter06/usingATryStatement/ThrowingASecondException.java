package sybex.chapter06.usingATryStatement;

/**
 * Created by hector on 06/02/2017.
 */
public class ThrowingASecondException {
    public String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before";
                v.length();
                result += "after";
            } catch (NullPointerException e) {
                result += "after";
                throw new RuntimeException("Catch Block");
            } finally {
                result += "finally";
                throw new Exception("Finally Block");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            result += "done";
        }
        return result;
    }

    public static void main(String[] args) {
        ThrowingASecondException throwingASecondException = new ThrowingASecondException();
        throwingASecondException.exceptions();
    }
}
