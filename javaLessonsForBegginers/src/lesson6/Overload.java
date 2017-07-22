package lesson6;

/**
 * Created by Goro on 22.07.2017.
 */
public class Overload {


    public static void main(String[] args) {
        System.out.println(write(12));
        System.out.println(write("ten"));
        System.out.println(write(4, 12));
    }

    public static String write(int num) {
        return ("Sending integer " + num);
    }

    public static String write(String num) {
        return ("Sending string " + num);
    }

    public static String write(int num1, int num2) {
        return ("Equals to " + (num1 + num2));
    }
}
