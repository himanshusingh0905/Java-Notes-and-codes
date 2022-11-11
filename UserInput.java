package AbdulBariJava;

import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.next();
        System.out.println();
        System.out.println("Enter your address: ");
        String address = in.nextLine();
        System.out.println("Printing:");
        System.out.println(name);
        System.out.println("address : ");

        while(in.hasNextInt())
        {
            System.out.println(in.nextInt());
            break;
        }

    }
}

/**
 *
 *    (i)  To use 'Scanner' class we have to import 'java.util.*' ['util' --> utility package].
 *    -----------------------------------------------------------------------------------------------------------------
 *    (ii)  There are some methods in Scanner class :
 *                                        1.    next() = for 'single word'
 *                                        2.    nextLine() = ' for whole line'   ?? For this I have to check cursor concept:
 *                                                                                  To solve this you can consume whole line using sc.nextLine().
 *                                                                       Then there won't be any problem.
 *
 *
 *                                        3.    nextInt() = for Integers
 *                                        4.    nextDouble() = for double values
 *                                        5.    nextFloat() = for float values
 *                                        6.    nextShort() = for short Integers
 *                                        7.    nextLong() = for long values
 *                                        8.    nextBoolean = for boolean values
 *                                        9.    nextByte()  = for 1 byte integer
 *
 *                                        10.   hasNextInt() = check if next element is String.
 *                                        11.   hasNext()
 *                                        12.   hasNextFloat()
 *
 *                                        13.   useRadix(int): Takes input in different number system
 *
 *         To know the methods in particular class for eg. in 'Scanner' class:
 *                                          Type: 'javap java.util.Scanner'  in command line,
 *                                                 this will show you all the built-in methods inside that class.
 *     -----------------------------------------------------------------------------------------------------------------------
 *
 *     (iii) To get user input: create new object of Scanner class.
 *                            like :  Scanner in = new Scanner(System.in);
 *                                      * Here in place of 'in' you could write any word of your choice.
 *                                      * Here 'System.in'  =  Keyboard
 *
 *
 *
 *
 *
 */