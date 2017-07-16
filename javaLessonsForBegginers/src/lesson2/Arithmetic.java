package lesson2;

/**
 * Created by Goro on 16.07.2017.
 */
public class Arithmetic {
    private static int num = 100;
    private static int factor = 20;
    private static int sum = 0;

    public static void main(String[] args) {
        sum = num + factor;
        System.out.println("Sum of numbers: " + sum);
        sum = num - factor;
        System.out.println("Minus: " + sum);
        sum = num * factor;
        System.out.println("Equals: " + sum);
        sum = num / factor;
        System.out.println("Divide: " + sum);
    }
}
