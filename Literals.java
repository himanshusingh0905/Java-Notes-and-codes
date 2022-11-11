package AbdulBariJava;

import static java.lang.Integer.toBinaryString;

public class Literals {
    public static void main(String[] args) {
        byte b1=10;        //   Decimal Number system
        byte b2=0b1010;    //   Binary number system with prefix = '0b'
        byte b3=012;       //   Octal number system with prefix = '0'
        byte b4=0xA;       //   Hexadecimal number system with prefix = '0X'

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        long l=9999999999L;
        float f=12.56f;
        double d=12.56d;

        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

    }
}
