package lesson5;

/**
 * Created by Goro on 21.07.2017.
 */
public class Power {
    public static void main(String[] args) {
        int num = 9;
        int square = (int) Math.pow(num, 2);
        int cube = (int) Math.pow(num, 3);
        int sqrt = (int) Math.sqrt(num);

        System.out.println(num + " in square equals to " + square);
        System.out.println(num + " in cube equals to " + cube);
        System.out.println("Sqrt from " + num + " equals to " + sqrt);
    }
}
