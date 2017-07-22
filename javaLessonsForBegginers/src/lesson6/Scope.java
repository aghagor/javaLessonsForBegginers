package lesson6;

/**
 * Created by Goro on 22.07.2017.
 */
public class Scope {


    public static void main(String[] args) {
        String txt = "This is the main() method's text";
        System.out.println(txt);

        sub();
    }

    private static void sub() {
        String txt = "This is sub() method's text";
        System.out.println(txt);
    }
}
