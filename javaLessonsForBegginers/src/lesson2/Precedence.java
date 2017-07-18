package lesson2;

/**
 * Created by Goro on 18.07.2017.
 */
public class Precedence {
    public static void main(String[] args) {
        int sum = 32 - 8 + 16 * 2;
        System.out.println("defolt: " + sum);

        sum = (32 - 8 + 16) * 2;
        System.out.println("first: " + sum);

        sum = (32 - (8 + 16)) * 2;
        System.out.println("second: " + sum);
    }
}
