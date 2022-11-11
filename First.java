package AbdulBariJava;
import java.lang.*;


class First
{
    /**
     *   Since JVM wont have an object reference of the class at that point, the main method has to be declared ‘static’
     *   and since the method is being called from an external object,it has to be declared ‘public’.
     *   This explains the ‘public static’ modifier for main.
     *
     */
    public static void main(String args[])
    {
        System.out.println("Hello world");
    }
}

/**
 *   JDK = JAVA DEVELOPMENT KIT : It includes processes like compilation , debugging
 *    [
 *          JRE = JAVA RUNTIME ENVIRONMENT : It is helpful for Execution of code.
 *             [
 *                    Inside JRE :  'java class libraries' and 'JVM' is present.
 *             ]
 *    ]
 *    first.java -> (javac) ---> first.class -> ( java first ) ---> OUTPUT
 *
 *  ==================================================================================================================
 *
 *      (1) package :-   * it's just like a folder.
 *                       * we create it for our convenience.
 *                       * If we don't create it, even then our will run.
 *                                  Eg:  While using VScode , Notepad we don't usually create packages.
 *
 *                       * Definition : A java package is a group of similar types of classes, interfaces and sub-packages.
 *                       * There are two types of packages :(1) built-in (ii) user-defined
 *                                          Ex. java = built-in
 *                                              lang = built-in ( its mandatory package)
 *
 * ==================================================================================================================
 *
 *      (2) import : Built-in keyword used for importing packages,classes etc.
 *
 * =================================================================================================================
 *      (3)  Note:  * Every java program is a class.
 *                  * its name should be same as file name.
 *
 *          Case I:  when class is not public:
 *
 *                      [
 *                           let's take example of above program:
 *                                     If I change class name to 'Second' and then compile it
 *                                       using:  javac First.java -->
 *                                                       'Second.class'  file will be generated.
 *                                       then:     java second  -->
 *                                                         will give us output.
 *                   ----------------------------------------------------------------------------------------
 *                     YOU CAN VERIFY IT USING NOTEPAD / terminal:
 *                        (i) Go to command prompt or any other CLI
 *                       (ii) Get into directory where your file is situated using 'cd' command
 *                      (iii) then type: ' javac First.java ' this will create another file named 'Second.class'
 *                            you can view it using 'dir' command that which files are there in directory.
 *
 *                      (iv) Then to run you'd have to type 'java Second' instead of 'java First' to fetch results,
 *                            Otherwise you will get 'ClassNotFoundException'.
 *
 *
 *
 *              CASE II : When class is public :
 *                         In this case there is no option other than writing 'file name' same as 'class name'.
 *                         else you'll get error.
 *
 * ==================================================================================================================
 *
 * WHAT IS SIGNIFICANCE OF 'String[] args' in main() method?
 *
 * Well, simply because JVM calls the main method which has a signature that accepts array of strings as an argument.
 * To better understand it, let us recall the concept of overloading. According to the concept of overloading,
 * a class can have many methods with the same name and different arguments.
 * The desired method will be called based on the type of argument passed.
 *
 *
 * Eg: 1. public void myMethod (int a) 2. public void myMethod(String a)
 * Which of the two ‘myMethod’s will be called depends on the arguments passed.
 *
 * Similarly, when the ‘Java’ command is invoked, JVM calls ‘public static void main(String args[])’.
 * Hence, the String arguments are absolutely necessary to provide an entry point to your application.
 * If we pass command line arguments, these arguments will be taken up as the elements of the ‘args’ array.
 *
 *
 *
 *
 *
 *
 *
 */

