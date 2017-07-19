package lesson2;

/**
 * Created by HCAV on 18.07.2017.
 */
public class Condition {
    private static int num1 = 1357;
    private static int num2 = 2468;

    public static void main(String[] args) {

        String result;

        result = (num1 % 2 != 0) ? "kent" : "zuyg";
        System.out.println(num1 + " - " + result);

        result = (num2 % 2 != 0) ? "kent" : "zuyg";
        System.out.println(num2 + " - " + result);
    }
}
