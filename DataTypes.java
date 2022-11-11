package AbdulBariJava;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        // Why this  is giving error?
        float a = 4.5789f;
        // Reason : your variable is of 'float' type but literal(4.5789) is of 'double' type
        //  So to declare a 'float' literal, append the value with 'f'. eg: 4.5789f

        long length = 746468l;

        char ch = 'b';
        System.out.println(ch);
        System.out.println("size of long in bytes : "+ Long.BYTES);
        System.out.println("size of Integer in bytes : "+ Integer.BYTES);
        System.out.println("size of Byte in bytes : "+ Byte.BYTES);
        System.out.println("size of Short in bytes : "+ Short.BYTES);
        System.out.println("size of Character in bytes : "+ Character.BYTES);



        System.out.println("Min value of Long : "+ Long.MIN_VALUE);
        System.out.println("Max value of Long : "+ Long.MAX_VALUE);
        System.out.println(a);
        System.out.println(ch);
    }
}
/**
 *     Basically there are four types of primitive data types in java :
 *                           ( Primitive means core part of compiler )
 *                                              (1) Integral
 *                                              (2) Decimal
 *                                              (3) Character
 *                                              (4) Boolean
 * -------------------------------------------------------------------------------------------------------------------
 *
 *    (I)  Integral :
 *               (i)  byte =  (1 Byte,   default value = 0)
 *              (ii)  short = (2 bytes,  default value = 0)
 *             (iii)  int =   (4 bytes,  default value = 0)
 *              (iv)  long =  (8 bytes,  default value = 0)
 *
 *
 *    (II) Decimal :
 *               (i) float =  (4 bytes,  default value = 0.0f)
 *              (ii) double = (8 bytes,  default value = 0.0d  or 0.0)
 *
 *
 *    (III) char : (2 bytes, default value = \u0000 )
 *
 *            WHY SIZE OF CHARACTER IS 2 BYTES IN JAVA ?
 *            ANS: Because java stores characters in unicode system. means java not only supports English but also many
 *                 other natural languages apart from English. And unicode system is super-set of ASCII. That's why it
 *                 needs more size compare to C++, Hence it takes 2 bytes.
 *
 *
 *     (IV)  boolean : ( size depend on JVM ,  default value = false)
 *
 *  -------------------------------------------------------------------------------------------------------------------
 *
 */