package lesson5;

/**
 * Created by Goro on 21.07.2017.
 */
public class Random {
    private static float random = (float) Math.random();

    public static void main(String[] args) {
        System.out.println("Random number: " + random);

        float multiplied = random * 10;
        System.out.println("Umnojennoe na 10: " + multiplied);

        int randomInt = (int) Math.ceil(multiplied);
        System.out.println("Random Integer: " + randomInt);
    }
}
