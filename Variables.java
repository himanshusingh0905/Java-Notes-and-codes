package AbdulBariJava;

import static java.lang.Integer.toBinaryString;

public class Variables {
    public static void main(String[] args) {
        String $name = "Hari Krishna";
        int _age = 45;
        System.out.println($name);
        System.out.println(_age);

        // Printing Binary form of a number. you can go 'javap java.lang.Integer' command and see the methods for doing the same.
        short x = -5;
        System.out.println(toBinaryString(x));


        // Why unicode?
        // Because java supports many local languages, so it needs greater range, hence greater byte size.

        System.out.println("Printing DevNagri letters : ");
        for(char ch = 0x0900;ch<=0x097f;ch++)
        {
            System.out.println(ch + " ");
        }

    }
}
/**
 *
 *    NAMING CONVENTION :
 *                 (1)  variable names are CASE-SENSITIVE.
 *                 (2)  variable name can consist of  ALPHABETS, NUMBERS, _ (Underscore) and $ (dollar sign).
 *                 (3)  variable name can only start with ALPHABETS, _ and $.
 *                 (4)  it's name should not be a KEYWORD.
 *                 (5)  it should not be a class name.
 *                 (6)  Follow camelCase
 */