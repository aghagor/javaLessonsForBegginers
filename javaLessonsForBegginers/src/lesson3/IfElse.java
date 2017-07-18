package lesson3;

/**
 * Created by Goro on 18.07.2017.
 */
public class IfElse {
    public static void main(String[] args) {
        int num = 15;

        if (5 > 1) {
            System.out.println("five big then one");
        }
        if (2 < 4) {
            System.out.println("two small then four");
            System.out.println("Check complite!!!");
        }
        if (((num > 5) && (num < 10)) || num == 12) {
            System.out.println(num);
        } else System.out.println("wrong number");

    }
}
