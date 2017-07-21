package lesson5;

/**
 * Created by Goro on 21.07.2017.
 */
public class Round {
    public static void main(String[] args) {
        float num = 7.25f;

        System.out.println(num + " rounded equals to " + Math.round(num));
        System.out.println(num + " rounded to down equals to " + Math.floor(num));
        System.out.println(num + " rounded to up equals to " + Math.ceil(num));
    }
}
