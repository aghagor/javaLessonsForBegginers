package lesson6;

/**
 * Created by Goro on 22.07.2017.
 */
public class SubClass extends SuperClass {


    public static void main(String[] args) {
        hello();
        SuperClass.hello();
        echo("Echo~~~o");
    }

    public static void hello() {
        System.out.println("Hello from subclass");
    }
}
