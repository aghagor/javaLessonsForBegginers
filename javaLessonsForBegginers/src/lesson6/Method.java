package lesson6;

/**
 * Created by Goro on 22.07.2017.
 */
public class Method {

    private static String msg;

    public static void main(String[] args) {

        msg = "In sub() method";
        System.out.println("In main() method");

        sub(msg);
    }

    private static void sub(String s) {
        System.out.println(s);
    }
}
