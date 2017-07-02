package sybex.mockExamQuestions.mockExamQuestion13;

/**
 * Created by hector on 13/03/2017.
 */
public class Handset {
    static String name;
    public static void main(String[] args) {
        /*int x = 10;
        int y = 20;
        int z = 30;
        int eArr1 [] = {10, 23, 10, 2};
        int [] eArr2 = new int[10];
        int [] eArr3 = new int[] {};

        double price;
        String model;
        Keys varKeys = (region, keys) ->
                        {if(keys >= 32)
                        return region; else return "default";};
        //System.out.println(model + price + varKeys.keypad("AB", 32));
        System.out.println("HOLA".substring(0));*/
        int ctr = 10;
        char[] arrC1 = new char[] {'P', 'a', 'u', 'l'};
        char[] arrC2 = {'H', 'a', 'r', 'r', 'y'};

        for (char c1 : arrC1) {
            //System.out.println(c1);
            for (char c2 : arrC2) {
                //System.out.println(c2);
                if (c2 == 'a') continue;
                ++ctr;
            }
        }
        System.out.println(ctr);
    }
}
