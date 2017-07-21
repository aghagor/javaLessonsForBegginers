package lesson5;

/**
 * Created by Goro on 21.07.2017.
 */
public class StringComparison {

    private static String password = "bingo";
    private static String dataPass = "bIngo";

    public static void main(String[] args) {
        try {
            if (dataPass.toLowerCase().equals(password)) {
                System.out.println("You are connected!!!");
            } else System.out.println("Incorect password!!!");
        } catch (Exception e) {
            System.out.println("Need enter password!!!");
        }


    }
}
