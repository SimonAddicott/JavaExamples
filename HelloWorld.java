/**
 * Hello World program
 * prints string to the console
 *
 * A class is a blueprint for a program
 * public simply tells the compiler that this is accessible
 */
public class HelloWorld {

    /**
     * Every java application will require a main method.
     * Consider this the starting point for every Java application, where things start from.
     *
     * @param args String
     *
     * public - again, this tells the compiler that the method can be access outside of the class
     * static - ths means the method/method values won't. Think of this as "written in stone"
     * void - this is the return type. This method will return nothing when called.
     */
    public static void  main(String args[])
    {
        // System.out is a library class that enables you to access a set of methods
        // that are used for OUTPUT stuff.
        // println(String) is a method that will print a single String line to the console
        System.out.println("Hello, World!");
    }

}
