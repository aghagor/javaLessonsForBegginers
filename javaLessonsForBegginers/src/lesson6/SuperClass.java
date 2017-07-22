package lesson6;

/**
 * Created by Goro on 22.07.2017.
 */
public class SuperClass {

    public static void hello() {
        System.out.println("Hello from superclass");
    }

    public static void echo(String arg) {
        try {
            System.out.println("You enter " + arg);
        } catch (Exception e) {
            System.out.println("Enter an argument");
        }
    }
}
