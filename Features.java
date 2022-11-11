package AbdulBariJava;

public class Features {
    public static void main(String[] args) {
        /**
         *
         *      **  Java is hybrid language ( compiler + Interpreter )
         *
         *                                 INTERPRETER   VS    COMPILER
         *          # Interpreter :
         *
         *          1. Read each line and translates and executes. ( javascript is Interpreted language and browser as interpreter.
         *          2. Doesn't make separate file after translation, Hence everytime we run it, we need Interpreter to
         *             translate code into machine code.
         *          3.  If there's a mistake in between then after that point it will not translate, will stop.
         *          4.  Slower, as everytime interpreter is needed to translate.
         *          5. Interpreted languages are easy to learn and easy for developing programs because you can handle errors easily
         *              as it translates line by line, so you can easily find out where is error.
         *
         *
         *          #  COMPILER :
         *
         *          1.  translates whole file at a time and makes a separate file after translation.
         *          2.  If there's an error in between, Then it will just give error and stop compilation.
         *          3.  Translation is done only one time after that you can run it as many times as you want.
         *          4.  Faster compared to interpreter
         *
         */

        /**
         *            How code is executed in java and c++ ?
         *
         *            IN JAVA:
         *                 First.java  ->   First.class  ->  JVM ( Interpreter + JIT compiler )  -> OS  -> Hardware
         *
         *                 STEPS:
         *                      1.   Source code(First.java) is converted int byte code via compiler(javac). and separate file is
         *                           created named -> First.class
         *                      2.   Now there comes JVM into action.  JVM actually executes that byte code and converts it into
         *                           Machine code.
         *                      3.    And then machine code is read by OS. which then put that hardware into action.
         *
         *
         *            IN C++ :
         *                first.c++  ->  first.exe  -> OS   -> hardware
         *
         *                STEPS :
         *                     1.    source code( first.c++) file is first compiled and, it results in creation of new file 'first.exe'
         *                            which is actually machine code. And this is done by compiler.
         *                     2.    Now via OS this program runs.
         *
         *
         *  =================================================================================================================================
         *        
         *
         *
         *
         */
    }
}
